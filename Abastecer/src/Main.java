import java.util.Scanner;

    public class Main {
        
        public static void main(String[] args) throws Exception {
            boolean looping = true;
            BombaCombustivel bomba = new BombaCombustivel();
            Scanner scanner = new Scanner(System.in);

        while (looping) {
        System.out.println("=========================\n 1 - Abastecer por valor\n 2 - Abastecer por litro\n 3 - Alterar valor\n 4 - Alterar Combustível\n 5 - Alterar quantidade de combustível\n 6 - Checar bomba\n 0 - Sair\n=========================");
        int opcao = scanner.nextInt();
        
        switch (opcao) {
            case 1:bomba.abastecerPorValor();
                
                break;
            case 2:bomba.abastecerPorLitro();
                
                break;
            case 3:bomba.alterarValor();
                
                break;
            case 4:bomba.alterarCombustivel();
                
                break;
            case 5:bomba.alterarQuantidadeCombustivel();
                
                break;
            case 6:bomba.checarBomba();
                
                break;
            case 0:
                looping = false;
                break;
        
            default:

                break;
        }
    
    
        }
    }

}
