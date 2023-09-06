public class Fisica extends Pessoa{
    private long cpf;
    private String nomeCompleto;

    public Fisica(long cpf, String nomeCompleto, String endereco) {
        super(endereco);
        this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
    }
}
