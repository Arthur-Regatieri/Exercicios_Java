import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.println("Number:");
        Integer number = scanner.nextInt();

        System.out.println("Holder:");
        scanner.nextLine();
        String holder = scanner.nextLine();

        System.out.println("Initial balance:");
        Double iBalance = scanner.nextDouble();

        System.out.println("Withdraw limit:");
        Double wLimit = scanner.nextDouble();

        Account account = new Account(number, holder, iBalance, wLimit);

        try {
            System.out.println("Enter amount for withdraw:");
            account.withdraw(scanner.nextDouble());
    
            System.out.println("New balance: " + account.getBalance());
        } catch (RuntimeException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

    }
}
