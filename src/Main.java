import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int numContas = 0;
    static Pessoa logado = null;
    static Banco banco = new Banco("Santander", "Rua Vasco", 123,0.4,100);
    public static void main(String[] args) {

        Pessoa titular = new Fisica(107799799, "Felipe","Jaragua");
        logado = titular;
        Pessoa titular2 = new Fisica(107799798, "Joao","Jaragua");
        Conta conta = new Corrente(numContas++,"felipe",100000,5,titular, 4000);
        Conta conta2 = new Poupanca(numContas++,"felipe",100000,5,titular2);
        banco.getContas().add(conta);
        banco.getContas().add(conta2);
        menu(titular, banco);
    }

    private static void menu(Pessoa titular, Banco banco) {
        int escolha = 0;
        do{
            System.out.println("""
                ----- Banco -----
                [1] Acessar contas
                [2] Criar nova conta
                [3] Logout
                """);
            System.out.print("> ");
            escolha = sc.nextInt();
            switch (escolha){
                case 1 -> {
                    listarContasUsuario();
                }
                case 2 -> {
                    criarNovaConta(titular, banco);
                }
                case 3 -> {
                    System.out.println("Fechando o programa...");
                    System.exit(0);
                }
            }
        }while(escolha<1 || escolha>5);
    }



    private static void criarNovaConta(Pessoa titular, Banco banco) {
        int escolhaNovaConta = 0;
        do {
            System.out.println("""
                ----- Banco -----
                [1] Nova conta corrente
                [2] Nova conta poupança
                [3] Nova conta credito
                [4] Voltar\040\040\040\040\040\040\040\040\040\040
                                """);
            System.out.print("> ");
            escolhaNovaConta = sc.nextInt();
            String senha = "";
            double saldo = 0;
            int qtdTransacao = 0;
            if(escolhaNovaConta>=1 && escolhaNovaConta<=3){
                System.out.print("Sua senha: ");
                senha = sc.next();
                System.out.print("Seu saldo: ");
                saldo = sc.nextDouble();
                System.out.print("Quantidade de transações permitidas: ");
                qtdTransacao = sc.nextInt(); }
            double limite = 0;
            switch (escolhaNovaConta){
                case 1, 3 -> {
                    System.out.print("limite: ");
                    limite = sc.nextDouble();
                    banco.cadastrarConta(numContas, senha,saldo,qtdTransacao,titular, limite, escolhaNovaConta);
                }
                case 2 ->{
                    banco.cadastrarConta(numContas, senha,saldo,qtdTransacao,titular);
                }
            }
        }while (escolhaNovaConta<1 || escolhaNovaConta>4);
    }

}
