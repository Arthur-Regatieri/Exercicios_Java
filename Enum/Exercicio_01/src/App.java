import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.swing.text.DateFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("MM/yyyy");
        
        System.out.println("Enter department's name:");
        String departmentName = scanner.nextLine();

        System.out.println("Enter worker data:");
        System.out.println("Name:");
        String name = scanner.nextLine();

        System.out.println("Level:");
        String level = scanner.nextLine();

        System.out.println("Base salary:");
        Double bSlary = scanner.nextDouble();

        Worker worker = new Worker(name, WorkerLevel.valueOf(level), bSlary, new Department(departmentName));

        System.out.println("How many contracts to this worker?");
        int nContracts = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < nContracts; i++) {
            System.out.println("Enter contract #" + (i+1) + " data:");
            System.out.println("Date (DD/MM/YYYY)");
            LocalDate date = LocalDate.parse(scanner.nextLine(), fmt1);

            System.out.println("Value per hour:");
            Double value = scanner.nextDouble();

            System.out.println("Duration:");
            Integer duration = scanner.nextInt();
            scanner.nextLine();

            HourContract contract = new HourContract(date, value, duration);

            worker.addContract(contract);
            
        }

        System.out.println("Enter month and year to calculate income (MM/YYYY):");
        String mesAno = scanner.nextLine();
        int month = Integer.parseInt(mesAno.substring(0,2));
        int year = Integer.parseInt(mesAno.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + mesAno + ": " + worker.income(year, month) );

    }
}
