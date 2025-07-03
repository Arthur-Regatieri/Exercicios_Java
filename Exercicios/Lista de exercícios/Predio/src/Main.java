import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean sair = true;
        Elevador elevador = new Elevador(13, 8);
        
        while (sair) {
            
            
            System.out.println("========================\n 1 - Inicializar\n 2 - Entrar\n 3 - Sair\n 4 - Subir\n 5 - Descer\n 0 - Sair app\n========================");
            int opc = scanner.nextInt();
        switch (opc) {
            case 0:
                sair = false;
                break;
            case 1:elevador.inicalizar();
                
                break;
            case 2:elevador.entrar();
                
                break;
            case 3:elevador.sair();
                
                break;
            case 4:elevador.subir();
                
                break;
            case 5:elevador.descer();
                
                break;

            default:
                break;
        }
    }

    }
}
