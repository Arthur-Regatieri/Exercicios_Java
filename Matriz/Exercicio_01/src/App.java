import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de linhas de sua matriz: ");
        int l = scanner.nextInt();

        System.out.println("Digite o número de colunas de sua matriz: ");
        int c = scanner.nextInt();


        int[][] numeros = new int[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Digite um número: ");
                numeros[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Escolha um número da matriz");
        int n = scanner.nextInt();

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                if (numeros[i][j] == n) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        
                        System.out.println("Left: " + numeros[i][j-1]);
                    }
                    if (j + 1 < c) {
                        System.out.println("Right: " + numeros[i][j+1]);
                    }

                    if (i > 0) {
                        System.out.println("Up: " + numeros[i-1][j]);
                    }

                    if (i + 1 < l) {
                        System.out.println("Down: " + numeros[i+1][j]);
                    }
                }
            }
        }
    }
}
