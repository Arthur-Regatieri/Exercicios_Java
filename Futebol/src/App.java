import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Jogador jogadores = new Jogador();
        int escolha;
        do {
            System.out.println("===========================\n" 
            + "1 - Cadastrar jogador\n" 
            + "2 - Idade\n" 
            + "3 - Aposentar\n" 
            + "4 - Jogadores Cadastrados\n" 
            + "0 - Sair");
            escolha = scanner.nextInt();
            
            switch (escolha) {
                case 1 -> jogadores.cadastrar();
                case 2 -> idadeJogador(jogadores);
                case 3 -> jogadores.aposentar();
                case 4 -> jogadores.dadosJogadores();
                case 0 -> System.exit(0);           
                default -> System.out.println("Digite um número válido!!");
            }

        } while (escolha != 0);
    }

    public static void idadeJogador(Jogador jogador){
        System.out.println("Digite o jogador que deseja saber a idade:");
        scanner.nextLine();
        String idade = scanner.nextLine();
        int indice = jogador.jogadores.indexOf(idade);
        System.out.println("O jogador tem " + jogador.idadae(jogador.aniversario, indice) + " anos de idade" );
    }
}
