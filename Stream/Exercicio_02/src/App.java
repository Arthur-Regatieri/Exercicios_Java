import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter full file path:");
        String path = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Employee> employees = new ArrayList<>();
            
            String line = br.readLine();
            while (line != null) {
                String[] data = line.split(",");
                employees.add(new Employee(data[0], data[1],Double.parseDouble(data[2])));
                line = br.readLine();
            }

            System.out.println("Enter salary: ");
            Double salary = scanner.nextDouble();

            Comparator<String> comp = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> emails = employees.stream()
                .filter(e -> e.getSalary() > salary)
                .map(e -> e.getEmail())
                .sorted(comp)
                .collect(Collectors.toList());
            
            System.out.println("Email of people whose salary is more than " + salary + ":");
            emails.forEach(System.out::println);

            Double sum = employees.stream()
            .filter(e -> e.getName().charAt(0) == 'M')
            .map(e -> e.getSalary())
            .reduce(0.0, (x,y) -> x + y);
            
            System.out.println("Sum of salary of people whose name starts with 'M': " 
            + String.format("%.2f", sum));

        } catch (IOException e) {
            e.getMessage();
        }
        scanner.close();
    }
}
