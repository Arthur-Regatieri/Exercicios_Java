import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<Contribuintes> contribuintes = new ArrayList<>();

        System.out.println("Enter the number of tax payers:");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Tax payer #" + (i+1) + " data:");
            System.out.println("Individual or company (i/c)?:");
            scanner.nextLine();
            char ch = scanner.nextLine().toUpperCase().charAt(0);

            System.out.println("Name:");
            String name = scanner.nextLine();

            System.out.println("Anual income:");
            Double anualIncome = scanner.nextDouble();

            switch (ch) {
                case 'I':
                    System.out.println("Health expenditures:");
                    Double healthExp = scanner.nextDouble();
                    contribuintes.add(new PessoaFisica(name, anualIncome, healthExp));

                    break;
                case 'C':
                    System.out.println("Number of employees:");
                    int numeroFuncionarios = scanner.nextInt();    
                    contribuintes.add(new PessoaJuridica(name, anualIncome, numeroFuncionarios));
                    break;
            
                default:
                    break;
            }
        }

        System.out.println("TAXES PAID:");
        Double total = 0.0;
        for (Contribuintes x : contribuintes) {
            System.out.println(x.toString());
            total += x.calculoImposto();
        }
        System.out.println("TOTAL TAXES: $" + String.format("%.2f", total));
    }
}
