public class Apartamento extends Imovel {
    private int andar;
    private double areaPrivativa;
    private double valorDeAvaliacao;
    
    public Apartamento(Endereco endereco, Responsavel responsavel, double valorDeAvaliacao, int andar, double areaPrivativa) {
        super(endereco, responsavel);
        this.andar = andar;
        this.areaPrivativa = areaPrivativa;
    }

    public int getAndar() {
        return andar;
    }

    public double getAreaPrivativa() {
        return areaPrivativa;
    }

    public double valorDeAvaliacao)(){
        return valorDeAvaliacao;
    }
}
