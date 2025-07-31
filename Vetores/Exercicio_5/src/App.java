import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar?");
        int n = scanner.nextInt();
        int[] numeros = new int[n];
        int mValor = 0;
        int posicao = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero:");
            numeros[i] = scanner.nextInt();
            if (mValor < numeros[i]) {
                mValor = numeros[i];
                posicao = i;                
            }
        }
        
        System.out.println("Maior valor = " + mValor);
        System.out.println("Posição do maior valor = " + posicao);
    }
}
