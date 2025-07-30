import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar?");
        int n = scanner.nextInt();
        int[] numeros = new int[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero:");
            numeros[i] = scanner.nextInt();
        }
        
        System.out.println("Números pares:");
        int cont = 0;
        for (int x : numeros) {
            if (x%2 == 0) {
                System.out.print(x + " ");
                cont++;
            }
        }
        System.out.println();
        System.out.println("Quantidade de pares = " + cont);
    }
}
