import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua Agência");
        String agencia = scanner.next();

        System.out.println("Digite o número da sua conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Digite o valor que deseja adicionar ao saldo da conta");
        float saldo = scanner.nextFloat();

        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$: " + saldo + " já está disponível para saque");
    }
}
