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

        System.out.println("Enter full file path: ");
        String path = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            List<Product> list = new ArrayList<>();
            
            String line = br.readLine();
            while (line != null) {
                String[] data = line.split(",");
                String name = data[0];
                Double price = Double.parseDouble(data[1]);
                list.add(new Product(name, price));
                line = br.readLine();
            }
            Double avg = list.stream().map(p -> p.getPrice()).reduce(0.0, (x,y) -> x + y) / list.size();

            System.out.println("Average price: " + String.format("%.2f", avg));

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names = list.stream().filter(p -> p.getPrice() < avg).map(p -> p.getName()).sorted(comp.reversed()).collect(Collectors.toList());

            names.forEach(System.out::println);
            
        } catch (IOException e) {
            e.getMessage();
        }

        

        scanner.close();
    }
}
