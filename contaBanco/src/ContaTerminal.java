import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da agência:");
        int agencia = scanner.nextInt();

        System.out.println("Digite o número da conta:");
        int conta = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite o nome do titular:");
        String titular = scanner.nextLine();

        System.out.println("Digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + titular + ", obrigado por criar a conta em nosso banco. Sua agência é " + agencia + 
                ", sua conta é " + conta + " e seu saldo é de R$" + saldo + " já está disponível para saque.");
    }
}
