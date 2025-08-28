import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter frmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");
        System.out.println("Numero:");
        int number = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Data (dd/MM/yyyy):");
        LocalDate date = LocalDate.parse(scanner.nextLine(), frmt1);

        System.out.println("Valor do contrato:");
        Double contractValue = scanner.nextDouble();

        Contract obj =  new Contract(number, date, contractValue);

        System.out.println("Entre com o numero de parcelas:");
        int installment = scanner.nextInt();

        ContractService service = new ContractService(new PaypalService());

        service.processContract(obj, installment);

        System.out.println("Parcelas:");
        System.out.println(obj.showInstallments());


    }
}
