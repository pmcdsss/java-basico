import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número da agência: ");
        agencia = entrada.nextLine();

        System.out.print("Digite o número da conta: ");
        numero = Integer.parseInt(entrada.nextLine());

        System.out.print("Digite o nome do cliente: ");
        nomeCliente = entrada.nextLine();

        System.out.print("Digite o saldo da conta: ");
        saldo = Double.parseDouble(entrada.nextLine());

        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, " +
                "sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo));
    }




}
