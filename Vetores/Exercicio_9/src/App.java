import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoas você vai digitar?");
        int n = scanner.nextInt();
        scanner.nextLine();

        int[] idades = new int[n];
        String[] nomes = new String[n];
        int maiorIdade = 0;
        int indiceMaisVelho = 0;
        
        for (int i = 0; i < idades.length; i++) {
            System.out.println("Dados da " + (i+1) + " pessoa:");
            System.out.println("Nome: ");
            nomes[i] = scanner.nextLine();

            System.out.println("Idade: ");
            idades[i] = scanner.nextInt();
            scanner.nextLine();

            if (maiorIdade < idades[i]) {
                maiorIdade = idades[i];
                indiceMaisVelho = i;
            }
        }

        System.out.println("Pessoa mais velha: " + nomes[indiceMaisVelho]);
    }
}
