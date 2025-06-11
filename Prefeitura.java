public class Prefeitura {
    private int idadeMinimaDesconto1;
    private double percentualDesconto1;
    private int idadeMinimaDesconto2;
    private double percentualDesconto2;

    public Prefeitura() {
        this.idadeMinimaDesconto1 = 0;
        this.percentualDesconto1 = 0.0;
        this.idadeMinimaDesconto2 = 0;
        this.percentualDesconto2 = 0.0;
    }

    public void configurarDesconto1(int idadeMinima, double percentual) {
        this.idadeMinimaDesconto1 = idadeMinima;
        this.percentualDesconto1 = percentual / 100.0;
    }

    public void configurarDesconto2(int idadeMinima, double percentual) {
        this.idadeMinimaDesconto2 = idadeMinima;
        this.percentualDesconto2 = percentual / 100.0;
    }

    public double calcularFatorDesconto(int idadeResponsavel) {
        if (this.idadeMinimaDesconto2 > 0 && idadeResponsavel >= this.idadeMinimaDesconto2) {
            return this.percentualDesconto2;
        }
        if (this.idadeMinimaDesconto1 > 0 && idadeResponsavel >= this.idadeMinimaDesconto1) {
            return this.percentualDesconto1;
        }
        return 0.0;
    }
}
