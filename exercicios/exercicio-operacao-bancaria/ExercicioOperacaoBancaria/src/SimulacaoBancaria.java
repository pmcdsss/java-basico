import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        int opcao;

        do {
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    exibirSaldo(saldo);
                    break;
                case 2:
                    double saque = scanner.nextDouble();
                    if (saldo < saque)
                        System.out.println("Saldo insuficiente.");
                    else {
                        saldo -= saque;
                        exibirSaldo(saldo);
                    }
                    break;
                case 3:
                    exibirSaldo(saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    public static void exibirSaldo(double saldo) {
        System.out.println("Saldo atual: " + saldo);
    }
}