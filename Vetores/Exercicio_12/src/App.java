import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos quartos serão alugados?");
        int n = scanner.nextInt();
        scanner.nextLine();

        Aluguel[] aluguel = new Aluguel[10];

        for (int i = 0; i < n; i++) {

            System.out.println("Rent #" + (i+1));
            System.out.println("Name:");
            String nome = scanner.nextLine();

            System.out.println("Email: ");
            String email = scanner.nextLine();

            System.out.println("Room: ");
            int room = scanner.nextInt();
            scanner.nextLine();




            aluguel[room] = new Aluguel(nome, email, room);
        }

        System.out.println("Busy rooms:");
        
        for (Aluguel x : aluguel) {
            if(x != null){
                System.out.println(x.toString());
            }
        }

    }
}
