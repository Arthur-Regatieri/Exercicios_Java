import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = scanner.nextInt();

        if (n1 == n2) {
            System.out.println("Os números são iguais!!!");            
        } else{
            if (n1 > n2) {
                System.out.println("Os números são diferentes e o " + n1 + " é maior do que o " + n2);
            } else if (n2 > n1) {
                System.out.println("Os números são diferentes e o " + n2 + " é maior do que o " + n1);
            }
        }
    }
}
