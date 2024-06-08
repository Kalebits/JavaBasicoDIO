import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        scanner.useDelimiter("\\n");
        int numeroDaConta;

        System.out.println("Digite o numero da conta");
        numeroDaConta = scanner.nextInt();

        String agencia;
        System.out.println("Digite a agencia da conta");
        agencia = scanner.next();

        String nome;
        System.out.println("Digite o seu nome");
        nome = scanner.next();

        double saldo;
        System.out.println("Digite o valor que deseja depositar");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
        + ", conta " + numeroDaConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
