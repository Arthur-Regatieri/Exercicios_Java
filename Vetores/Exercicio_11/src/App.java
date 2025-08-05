import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas?");
        int n = scanner.nextInt();

        Pessoas pessoa = new Pessoas(n);

        for (int i = 0; i < n; i++) {

            System.out.println("Altura da " + (i+1) + "a pessoa:");
            Double alt = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Genero da "+ (i+1) +"a pessoa:");
            char gen = scanner.nextLine().toUpperCase().charAt(0);


            pessoa.adicionar(i, alt, gen);
        }

        System.out.println("Menor alt = " + pessoa.menorAltura());
        System.out.println("Maior alt = " + pessoa.maiorAltura());
        System.out.println("Media das alturas das mulheres = " + String.format("%.2f", pessoa.mediaF()));
        System.out.println("Número de homens = " + pessoa.numeroHomens());


    }
}
