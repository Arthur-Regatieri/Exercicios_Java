import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a distância percorrida em Km: ");
        int distancia = scanner.nextInt();
        System.out.println("Digite a quantidade de combustível gasto em L: ");
        int combustivel = scanner.nextInt();
        System.out.println("O carro faz: "+ (distancia/combustivel) + " Km/L");
    }
}
