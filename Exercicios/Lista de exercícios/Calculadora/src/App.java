import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static CalculadoraCientifica calculadora = new CalculadoraCientifica();
    public static void main(String[] args) throws Exception {
        int escolha;
        do {
            System.out.println("====================\n"
            +"1 - Calculadora\n"
            +"0 - Sair");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1 -> calcular(); 
                case 0 -> System.exit(0);  
                default -> System.out.println("Digite um número válido!!");
            }
            
        } while (escolha != 0);
    }

    public static void calcular(){
        boolean resultado = true;
        char operacao = ' ';
        List<Double> calcular = new ArrayList<>();
        int pot = 0;
        do {
            System.out.println("Digite um número: ");
            Double numero = scanner.nextDouble();
            scanner.nextLine();
            calcular.add(numero);
            if (operacao == ' ') {
            System.out.println("Escolha a operação que deseja realizar:\n"
            + "+ Somar\n"
            + "- Subtrair\n"
            + "* Multiplicar\n"
            + "/ Dividir\n"
            + "P Elevar ao quadrado\n"
            + "Q Raiz quadrada");
                String input = scanner.nextLine();
                operacao = input.length() > 0 ? input.charAt(0) : ' ';
                if (operacao == 'P') {
                    System.out.println("Deseja elevar a que potência?");
                    pot = scanner.nextInt();
                    resultado = false;
                    break;                
                }else if (operacao == 'Q') {
                    resultado = false;
                    break;
                }
            } else if (calcular.size() >= 2) {
                System.out.println("Deseja ver o resultado?");
                String decision = scanner.nextLine();
                if (decision.charAt(0) == 's') {
                    resultado = false;
                    break;
                }
            }
        } while (resultado == true);
        switch (operacao) {
            case '+': System.out.println("O resultado de sua soma é:" + calculadora.somar(calcular));
            break;
            case '-': System.out.println("O resultado de sua subtração é:" + calculadora.subtrair(calcular));
            break;
            case '*': System.out.println("O resultado de sua multiplicação é:" + calculadora.multiplicar(calcular));
               break;
            case '/': System.out.println("O resultado de sua divisão é:" + calculadora.dividir(calcular));
               break;
            case 'P': System.out.println("O resultado de sua potencialização é:" + calculadora.potencia(calcular, pot));
               break;
            case 'Q': System.out.println("O resultado de sua raiz quadrada é:" + calculadora.raizQuadrada(calcular));
               break;
            default: System.out.println("Digite uma operção válida!!!");
                break;
        }
            calcular.removeAll(calcular);
    }
}
