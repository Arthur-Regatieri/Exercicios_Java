import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos elementos vão ter o vetor?");
        int n = scanner.nextInt();
        int[] numeros = new int[n];
        int soma = 0;
        int media = 0;
        int count = 0;     
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número:");
            numeros[i] = scanner.nextInt();
            if (numeros[i]%2 == 0) {
                count++;
                soma += numeros[i];
                media = soma/count;
            }
        }

        if (count == 0) {
            System.out.println("Nenhum número par");
        }else{
            System.out.println("Media dos números pares = " + media);
        }
    }
}
