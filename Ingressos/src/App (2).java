import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int escolha;
        Ingresso ingresso = new Ingresso();
        IngressoVip ingressoVip = new IngressoVip();
        do {
            System.out.println("====================\n"
            +"1 - Ingresso\n"
            +"2 - Ingresso VIP\n"
            +"0 - Sair");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1 -> System.out.println("o valor do ingreso comum é: " + ingresso.imprimirValor()); 
                case 2 -> System.out.println("o valor do ingreso VIP é: " + ingressoVip.IngressoVIP());
                case 0 -> System.exit(0);  
                default -> System.out.println("Digite um número válido!!");
            }
            
        } while (escolha != 0);
    }
}
