import java.util.Scanner;

public class Operacoes {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int n1 = scanner.nextInt();
        System.out.println("Digite outro número:");
        int n2 = scanner.nextInt();
        int tot = 0;

        for(int i = 0; i < 4; i++){
            if (i == 0) {
               tot = n1 + n2;
            }
            else if (i == 1){
                tot = n1 - n2;
            }else if (i == 2){
                tot = n1 * n2;
            }else if (i == 3){
                tot = n1 / n2;
            }
            System.out.println(tot);
        }

    }
}
