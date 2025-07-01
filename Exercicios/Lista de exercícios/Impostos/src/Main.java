import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o preço de custo do carro: ");
        double custo = scanner.nextDouble();
        custo = (custo*1.45)*1.28;
        System.out.println("O valor final do carro será: " + custo);
    }
}
