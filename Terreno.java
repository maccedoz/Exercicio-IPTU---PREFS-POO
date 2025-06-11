import java.text.NumberFormat;
import java.util.Locale;

public class Terreno extends Imovel {
    private double areaTotal;

    public Terreno(Endereco endereco, double valorAvaliacao, Responsavel responsavel, double areaTotal) {
        super(endereco, valorAvaliacao, responsavel);
        this.areaTotal = areaTotal;
    }

    @Override
    public double calcularIptuBase() {
        return this.valorAvaliacao * 0.01;
    }

    @Override
    public double calcularIptuComDesconto(Prefeitura prefeitura) {
        // Terrenos não possuem desconto.
        return this.calcularIptuBase();
    }

    @Override
    public void exibirDescricao() {
        NumberFormat formatadorMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.println("--- Detalhes do Terreno ---");
        super.exibirDescricao();
        System.out.println("Área Total: " + this.areaTotal + " m²");
        
        double iptu = this.calcularIptuBase();
        System.out.println("IPTU: " + formatadorMoeda.format(iptu));
        System.out.println("Obs: Terrenos não têm direito a desconto.");
    }
}
