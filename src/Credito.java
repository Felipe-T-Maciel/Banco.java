public class Credito extends Conta{

    private int daiFatura;
    private double limite;

    public Credito(int numero, String senha, double saldo, int qtdTransacoes, Pessoa titular, double limite) {
        super(numero, senha, saldo, qtdTransacoes, titular);
        this.daiFatura = 30;
        this.limite = limite;

    }
}
