import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jogador {
    protected ArrayList<String> jogadores = new ArrayList<>();
    protected List<String> posicao = new ArrayList<>();
    protected List<LocalDate> aniversario = new ArrayList<>();
    protected List<String> nacionalidade = new ArrayList<>();
    protected List<Double> altura = new ArrayList<>();
    protected List<Double> peso = new ArrayList<>();
    protected final LocalDate hoje = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    Scanner scanner = new Scanner(System.in);


    public void cadastrar(){
        System.out.println("Digite o nome do jogador: ");
        jogadores.add(scanner.nextLine());
        System.out.println("Digite a posição do jogador: ");
        posicao.add(scanner.nextLine());
        System.out.println("Digite a nacionalidade do jogador: ");
        nacionalidade.add(scanner.nextLine());
        System.out.println("Digite a altura do jogador: ");
        altura.add(scanner.nextDouble());
        System.out.println("Digite o peso do jogador: ");
        peso.add(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Digite a data de aniversário do jogador: ");
        String data = scanner.nextLine();
        LocalDate niver = null;
        niver = LocalDate.parse(data, formatter);
        aniversario.add(niver);
    }


    public void dadosJogadores(){
        for (int i = 0; i < jogadores.size(); i++) {
            System.out.println(" O jogador " + jogadores.get(i) + " tem " + idadae(aniversario, i) 
            + " anos de idade, tem " + altura.get(i) + " metros de altura, pesa " + peso.get(i) 
            + " Kg e é " + nacionalidade.get(i));
        }
    }



    public int idadae(List<LocalDate> aniversario, int i){
        Period periodo = Period.between(aniversario.get(i), hoje);
        return periodo.getYears();
    }

    public void aposentar(){
        System.out.println("Digite o nome de um jogador");
        boolean existe;
         while (existe = true) {
            String jogador = scanner.nextLine();
            
            if (jogadores.contains(jogador)) {
                int indice = jogadores.indexOf(jogador);
                int aposentar;
                if (posicao.get(indice).equals("defesa")) {
                    aposentar = 40 - idadae(aniversario, indice);
                    System.out.println("O jogador se aposentará em "+ aposentar + " anos");
                }else if (posicao.get(indice).equals("meio-campo")) {
                    aposentar = 38 - idadae(aniversario, indice);
                    System.out.println("O jogador se aposentará em "+ aposentar + " anos");
                } else if (posicao.get(indice).equals("atacante")) {
                    aposentar = 35 - idadae(aniversario, indice);
                    System.out.println("O jogador se aposentará em "+ aposentar + " anos");
                }

                existe = false;
                return;            
            }
            System.out.println("Nome invalido, por favor digite novamente");
        }

    }
}
