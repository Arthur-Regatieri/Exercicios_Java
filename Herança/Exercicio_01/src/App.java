import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        System.out.println("Enter the number of employees:");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("Employee #" + (i+1) + " data:");
            System.out.println("Outsourced (y/n)?");
            char check = sc.nextLine().toUpperCase().charAt(0);

            System.out.println("Name: ");
            String name = sc.nextLine();

            System.out.println("Hours: ");
            Integer hours = sc.nextInt();

            System.out.println("Value per hour: ");
            Double vHours = sc.nextDouble();

            if (check == 'Y') {
                System.out.println("Additional charge: ");
                Double addCharge = sc.nextDouble();
                employees.add(new OutsourcedEmployee(name, hours, vHours, addCharge));
            } else{
                employees.add(new Employee(name, hours, vHours));
            }

            sc.nextLine();
        }

        System.out.println("PAYMENTS:");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " - $" + String.format("%.2f", employee.payment()));
        }

        sc.close();
    }
}
