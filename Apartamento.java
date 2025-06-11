// Exemplo de implementação em Java

public class Apartamento extends Imovel {
    private int andar;
    private double areaPrivativa;

    public Apartamento(Endereco endereco, double valorDeAvaliacao, Pessoa responsavel, int andar, double areaPrivativa) {
        super(endereco, valorDeAvaliacao, responsavel);
        this.andar = andar;
        this.areaPrivativa = areaPrivativa;
    }

    public int getAndar() {
        return andar;
    }

    public double getAreaPrivativa() {
        return areaPrivativa;
    }
}