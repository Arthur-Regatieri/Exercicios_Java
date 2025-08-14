import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.swing.text.DateFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter frmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 

        System.out.println("Enter cliente data:");
        System.out.println("Name:");
        String name = scanner.nextLine();

        System.out.println("Email:");
        String email = scanner.nextLine();

        System.out.println("Birth date (DD/MM/YYYY):");
        LocalDate birthDate = LocalDate.parse(scanner.nextLine(), frmt1);

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data:");
        System.out.println("Status:");
        String status = scanner.nextLine();
        Order order = new Order(OrderStatus.valueOf(status), client);
        
        System.out.println("How many items to this order?");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter #" + (i+1) + " item data:");
            System.out.println("Product name:");
            String pName = scanner.nextLine();

            System.out.println("Product price:");
            Double price = scanner.nextDouble();

            System.out.println("Quantity:");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            
            OrderItem orderItem = new OrderItem(quantity, new Product(pName, price));
            order.addItem(orderItem);
            
        }
        

        System.out.println(order);

    }
}
