import java.util.Scanner;

public class Graus {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em °C: ");
        double celcius = scanner.nextDouble();
        double fahrenheit = (9*celcius + 160)/5;
        System.out.println("A temperatura em fahrenheit é " + fahrenheit + " °F");

    }
}
