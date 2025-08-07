import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many employees will be registered??");
        int n = scanner.nextInt();
        
        List<Emplyoee> funcionario = new ArrayList<>();
        
        
        for (int i = 0; i < n; i++) {
            
            System.out.println("Employee #" + (i+1));
            System.out.println("Id: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Name:");
            String nome = scanner.nextLine();

            System.out.println("Salary: ");
            Double salary = scanner.nextDouble();

            funcionario.add(new Emplyoee(id, nome, salary));
        }

        System.out.println("Enter the employee id that will have salary increase:");
        int id = scanner.nextInt();
        int pos = position(funcionario, id);
        if (pos == -1){
            System.out.println("This id does not exist! ");
        }else{
            System.out.println("Enter the percentage:");
            Double percentage = scanner.nextDouble();
    
            funcionario.get(pos).aumento(percentage);
        }
        

        System.out.println("List of employees: ");
        for (Emplyoee x : funcionario) {
            System.out.println(x.toString());
        }
        
    }

    public static int position(List<Emplyoee> list, int id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i; // retorna o índice se encontrar
            }
        }
        return -1; // retorna -1 se não encontrar
    }
}
