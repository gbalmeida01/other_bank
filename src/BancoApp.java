import java.util.Scanner;
import java.util.ArrayList;

public class BancoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> contas = new ArrayList<>();
        ArrayList<Double> saldos = new ArrayList<>();

        while (true) {
            System.out.println("1 - Criar conta");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Ver saldo");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Digite o nome do cliente:");
                String nome = sc.nextLine(); // BUG: Scanner pode pular aqui

                contas.add(nome);
                saldos.add(0.0);

                System.out.println("Conta criada com sucesso!");
            } else if (opcao == 2) {
                System.out.print("Digite o número da conta: ");
                int conta = sc.nextInt();

                System.out.print("Digite o valor para depositar: ");
                double valor = sc.nextDouble();

                double saldoAtual = saldos.get(conta); // POSSÍVEL ERRO
                saldoAtual = saldoAtual + valor;
                saldos.set(conta, saldoAtual);

                System.out.println("Depósito realizado.");
            } else if (opcao == 3) {
                System.out.print("Número da conta: ");
                int conta = sc.nextInt();
                System.out.print("Valor para sacar: ");
                double valor = sc.nextDouble();

                if (valor <= saldos.get(conta)) {
                    double novoSaldo = saldos.get(conta) - valor;
                    saldos.set(conta, novoSaldo);
                    System.out.println("Saque realizado.");
                } else {
                    System.out.println("Saldo insuficiente.");
                }
            } else if (opcao == 4) {
                System.out.print("Digite a conta: ");
                int conta = sc.nextInt();

                System.out.println("Titular: " + contas.get(conta));
                System.out.println("Saldo: R$" + saldos.get(conta));
            } else if (opcao == 5) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida.");
            }

            System.out.println();
        }

        sc.close();
    }
}
