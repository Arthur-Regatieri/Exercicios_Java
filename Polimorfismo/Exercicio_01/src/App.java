import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.DateFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter frmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        List<Product> products = new ArrayList<>();

        System.out.println("Enter the number of products:");
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i+1) + " data:");
            System.out.println("Common, used or imported (c/u/i)?");
            scanner.nextLine();
            char ch = scanner.nextLine().toUpperCase().charAt(0);

            System.out.println("Name: ");
            String name = scanner.nextLine();

            System.out.println("Price: ");
            Double price = scanner.nextDouble();

            switch (ch) {
                case 'C': 
                    products.add(new Product(name, price));
                    break;
                case 'U':
                    System.out.println("Manufacture date (DD/MM/YYYY):");
                    scanner.nextLine();
                    LocalDate date = LocalDate.parse(scanner.nextLine(), frmt1);
                    products.add(new UsedProduct(name, price, date));
                    break;
                case 'I':
                    System.out.println("Customs fee: ");
                    Double customsFee = scanner.nextDouble();
                    products.add(new ImportedProduct(name, price, customsFee));
                    break;
            
                default:
                    break;
            } 
        }

        System.out.println("PRICE TAGS:");
        for (Product product : products) {
            System.out.println(product.priceTag());
            
        }
        scanner.close();
    }
}
