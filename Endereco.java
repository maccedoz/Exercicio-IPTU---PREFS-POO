public class Endereco {
    private String rua;
    private String numero;
    private String bairro;

    public Endereco(String rua, String numero, String bairro) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }
    public String getNumero() {
        return numero;
    }
    public String getBairro() {
        return bairro;
    }
}