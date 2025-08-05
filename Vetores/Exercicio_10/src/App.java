import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos alunos serao digitados?");
        int n = scanner.nextInt();
        scanner.nextLine();

        Aluno aluno = new Aluno(n);

        for (int i = 0; i < n; i++) {

            System.out.println("Digite nome, primeira e segunda nota do "+ (i+1) +"° aluno:");
            String nome = scanner.nextLine();
            Double nota1 = scanner.nextDouble();
            Double nota2 = scanner.nextDouble();
            scanner.nextLine();

            aluno.adicionarAluno(i, nome, nota1, nota2);
        }

        System.out.println("Alunos aprovados:");
        aluno.aprovados();


    }
}
