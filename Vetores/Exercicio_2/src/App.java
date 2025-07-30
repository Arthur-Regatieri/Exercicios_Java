import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Integer soma = 0;
        Integer media = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar? ");
        int n = scanner.nextInt();

        Integer[] numeros = new Integer[n];

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite um número:");
            Integer num = scanner.nextInt();
            numeros[i] = num;
            soma += num;
        }
        media = soma / n;

        for (Integer nums : numeros) {
            System.out.print(nums);
            System.out.println();
            System.out.println("Soma: " + soma);
            System.out.println("Media: " + media);
        }

    }
}
