import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo = 237.48;

        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, digite o número de sua Agência: ");
        agencia = input.next();

        System.out.println("Digite o seu número: ");
        numero = input.nextInt();
        input.nextLine();

        System.out.println("Digite o seu nome: ");
        nomeCliente = input.nextLine();

        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia + " conta: " + numero + " e seu saldo R$ " + saldo + ".");
        System.out.println("Já está disponível para o saque.");

        input.close();
    }
}
