public class Corrente extends Conta{
    private double limite;

    public Corrente(int numero, String senha, double saldo, int qtdTransacoes, Pessoa titular, double limite) {
        super(numero, senha, saldo, qtdTransacoes, titular);
        this.limite = limite;
    }


    public void saque(){}

    public void transferencia(){}
}
