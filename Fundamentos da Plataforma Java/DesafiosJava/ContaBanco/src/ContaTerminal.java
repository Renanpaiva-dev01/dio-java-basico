import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        //Exibir as mensagnes para o nosso usuário
        //Obter pela classe scanner os valores digitados no terminal
        // Exibir a mensagem conta criada
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numero;
        String agencia;
        String nomeCliente;
        Double saldo;

        System.out.println("Digite o número da agência");
        numero = scanner.nextInt();
        System.out.println("Digite a agência");
        agencia = scanner.next();
        System.out.println("Digite o nome do cliente");
        nomeCliente = scanner.next();
        System.out.println("Digite o saldo");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo "
                + saldo + " já está disponível para saque");
    }
}
