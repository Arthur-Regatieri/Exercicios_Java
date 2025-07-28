import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       int escolha;
       Agenda agenda = new Agenda();

       do {
        System.out.println("===============\n"
        + "1 - Adicionar contato\n"
        + "2 - Buscar contato\n"
        + "3 - Mostrar informações do contato\n"
        + "4 - Remover contato\n"
        + "5 - Mostrar contatos da agenda\n");
        escolha = scanner.nextInt();

        switch (escolha) {
            case 1 -> agenda.armazenarPessoa();
            case 2 -> agenda.buscarPessoa();
            case 3 -> agenda.imprimirPessoa();
            case 4 -> agenda.removerPessoa();
            case 5 -> agenda.imprimirAgenda();
            case 0 -> System.exit(0);
            default -> System.out.println("Digite um número válido");
        }
        
       } while (escolha != 0);
    }
}
