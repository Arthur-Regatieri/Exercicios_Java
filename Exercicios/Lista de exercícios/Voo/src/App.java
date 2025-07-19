import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Voo voo = new Voo(234, 11, 9, 2001);
        int escolha;
        do {
            System.out.println("===========================\n 1 - Proximo assento livre\n 2 - Verificar assento\n 3 - Escolher assento\n 4 - Quantidade de vagas disponíveis\n 5 - Número do voo\n 0 - Sair");
            escolha = scanner.nextInt();
            
            switch (escolha) {
                case 1 -> voo.proximoLivre();
                case 2 -> escolherAssento(voo);
                case 3 -> oucuparAssento(voo);
                case 4 -> System.out.println("O avião tem " + voo.vagasDisponiveis() + " vagas disponíveis");
                case 5 -> System.out.println("O número do voo é: " + voo.getnVoo());
                case 0 -> System.exit(0);           
                default -> System.out.println("Digite um número válido!!");
            }

        } while (escolha != 0);
    }

    private static void escolherAssento(Voo voo){
        System.out.println("Escolha um número de assento.");
        int cadeira = scanner.nextInt();
        voo.verifica(cadeira);
    }

    private static void oucuparAssento(Voo voo){
        System.out.println("Escolha um número de assento.");
        int cadeira = scanner.nextInt();
        voo.ocupa(cadeira);
    }
}
