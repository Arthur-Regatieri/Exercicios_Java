import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas pessoas serao digitadas?");
        int n = scanner.nextInt();
        Altura altura = new Altura(n);
        scanner.nextLine();

        for(int i = 0; i < n; i++){
            System.out.println("Nome: ");
            String name = scanner.nextLine();

            System.out.println("Idade: ");
            int age = scanner.nextInt();

            System.out.println("Altura: ");
            Double alt = scanner.nextDouble();
            scanner.nextLine();

            altura.adicionarPessoa(i, name, age, alt);
        }
        
        System.out.println("Altura média: " + altura.alturaMedia());
        System.out.println("Pessoas com menos de 16 anos: " + String.format("%.2f", altura.subIdade()));
        altura.menorIdade();

        scanner.close();
    }
}
