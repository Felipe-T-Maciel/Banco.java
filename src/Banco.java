import java.util.ArrayList;

public class Banco {
    private String nome;
    private String endereco;
    private int agencia;
    private ArrayList<Conta> contas = new ArrayList<Conta>();
    private double juros;
    private double taxaDeServico;

    public Banco(String nome, String endereco, int agencia, double juros, double taxaDeServico){
        this.nome = nome;
        this.endereco = endereco;
        this.agencia = agencia;
        this.juros = juros;
        this.taxaDeServico = taxaDeServico;
    }

    public void cadastrarConta(int numContas, String senha, double saldo, int qtdTransacao, Pessoa titular) {
        Conta conta = new Poupanca(numContas++,senha,saldo,qtdTransacao,titular);
        contas.add(conta);
    }

    public void cadastrarConta(int numContas, String senha, double saldo, int qtdTransacao, Pessoa titular, double limite, int escolhaNovaConta) {
        if(escolhaNovaConta == 1){
            Conta conta = new Corrente(numContas++,senha,saldo,qtdTransacao,titular,limite);
            contas.add(conta);
        }else {
            Conta conta = new Credito(numContas++,senha,saldo,qtdTransacao,titular,limite);
            contas.add(conta);
        }
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }
}
