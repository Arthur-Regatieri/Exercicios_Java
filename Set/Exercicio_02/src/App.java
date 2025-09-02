import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int aluno = 0;
        int numeroAlunos = 0;
        Set<Integer> set = new HashSet<>();

        System.out.println("How many students for course A?");
        numeroAlunos = scanner.nextInt();

        for (int i = 0; i < numeroAlunos; i++) {
            aluno = scanner.nextInt();
            set.add(aluno);
            
        }

        System.out.println("How many students for course B?");
        numeroAlunos = scanner.nextInt();
        for (int i = 0; i < numeroAlunos; i++) {
            aluno = scanner.nextInt();
            set.add(aluno);
        }

        System.out.println("How many students for course C?");
        numeroAlunos = scanner.nextInt();

        for (int i = 0; i < numeroAlunos; i++) {
            aluno = scanner.nextInt();
            set.add(aluno);
            
        }

        System.out.println("Total students: " + set.size());
    }
}
