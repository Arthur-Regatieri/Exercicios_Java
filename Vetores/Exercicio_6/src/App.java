import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos valores vão ter cada vetor?");
        int n = scanner.nextInt();
        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] vetorC = new int[n];


        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite os valores do vetor A:");
            vetorA[i] = scanner.nextInt();
            
        }

        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Digite os valores do vetor B:");
            vetorB[i] = scanner.nextInt();
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        System.out.println("Vetor resultante:");

        for (int i : vetorC) {
            System.out.println(i);
            
        }
        
    }
}
