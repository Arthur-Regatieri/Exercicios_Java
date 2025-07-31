import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos elementos vão ter o vetor?");
        int n = scanner.nextInt();
        Double[] numeros = new Double[n];
        Double soma = 0.0;
        Double media = 0.0;
        
        
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número:");
            numeros[i] = scanner.nextDouble();
            soma += numeros[i];
            media = soma/(i+1);
        }

        System.out.println("Media do vetor: " + String.format("%.3f", media));
        System.out.println("Elementos abaixo da média:");

        for (Double x : numeros) {
            if (x < media) {
                System.out.println(x);                
            }            
        }
    }
}
