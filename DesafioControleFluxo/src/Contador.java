import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = scanner.nextInt();
        
        try{
            contar(numero1, numero2);

        }catch (ParametrosInvalidosException exception){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int num1, int num2) throws ParametrosInvalidosException{
        if (num1 > num2) {
            throw new ParametrosInvalidosException();
            
        }else{

        int contagem = num2 - num1;
        for(int i = 1; i <= contagem; i++){
            System.out.println(i);
        }
    }
    }

}
