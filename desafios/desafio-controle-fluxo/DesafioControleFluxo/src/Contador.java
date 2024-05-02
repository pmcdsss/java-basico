import java.util.Scanner;

public class Contador {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int parametroUm, parametroDois;

        System.out.print("Digite o primeiro parâmetro: ");
        parametroUm = input.nextInt();

        System.out.print("Digite o segundo parâmetro: ");
        parametroDois = input.nextInt();

        try{
           contar(parametroUm, parametroDois);
        }
        catch (ParametroInvalidoException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void contar(int parametroUm, int parametroDois) throws ParametroInvalidoException
    {
        if (parametroDois < parametroUm)
            throw new ParametroInvalidoException();

        int contagem = parametroDois - parametroUm;

        for(int i=1; i <= contagem; i++)
            System.out.println("Imprimindo o número " + i);
    }

}
