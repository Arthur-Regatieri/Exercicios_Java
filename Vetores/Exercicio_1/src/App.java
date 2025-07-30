import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Quantos numeros voce vai digitar?");
        int n = scanner.nextInt();
        leitorNumerosNegativos(n);
        
    }
    
    public static void leitorNumerosNegativos(int n){
        Integer[] numeros = new Integer[n];
    
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite um número:");
            Integer num = scanner.nextInt();
            numeros[i] = num;
        }
        System.out.println("Números negativos:");
        for (Integer numer : numeros) {
            if (numer < 0 ) {
                System.out.println(numer);
            }
        }
        
    }
}
