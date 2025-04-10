import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuário
        System.out.println("Por favor, digite o número da Conta:");
        //Obter pela scanner os valores digitados no terminal
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu Nome:");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o seu Saldo:");
        double saldo = scanner.nextDouble();
        // Exibir a mensagem conta criada

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero +" e seu saldo "+ saldo +" já está disponível para saque");
        scanner.close();
    }
}
