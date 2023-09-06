public class Conta {
    private int numero;
    private String senha;
    private double saldo;
    private int qtdTransacoes;
    private Pessoa titular;

    public Conta(
            int numero, String senha, double saldo, int qtdTransacoes, Pessoa titular
    ){
        this.numero = numero;
        this.senha = senha;
        this.saldo = saldo;
        this.qtdTransacoes = qtdTransacoes;
        this.titular = titular;
    }

    public void pagamento(){}
    public void credito(){}
    public void saldo(){}

    public Pessoa getTitular() {
        return titular;
    }
}
