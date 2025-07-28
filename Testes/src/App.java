import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int id1 = scanner.nextInt();
        Double qnt1 = scanner.nextDouble();
        Double vlr1 = scanner.nextDouble();

        int id2 = scanner.nextInt();
        Double qnt2 = scanner.nextDouble();
        Double vlr2 = scanner.nextDouble();

        System.out.printf("Valor a pagar: %.2f\n ", (qnt1 * vlr1 + qnt2 * vlr2) );
        scanner.close();
    }
}
