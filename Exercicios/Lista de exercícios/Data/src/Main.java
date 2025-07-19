import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Data data1 = new Data(14, 12, 2000);
        Data data2 = new Data(12, 9, 2001);
        int escolha;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("===========================\n 1 - Compara\n 2 - Dia\n 3 - Mês\n 4 - Ano\n 5 - Data\n 6 - Bissexto\n 7 - Clone\n 0 - Sair");
            escolha = scanner.nextInt();
            
            switch (escolha) {
                case 1: compara(data1, data2);
                    
                    break;
                case 2: System.out.println(data1.getDia());
                    
                    break;
                case 3: System.out.println(data1.getMes());
                    
                    break;
                case 4: System.out.println(data1.getAno());
                    
                    break;
                case 5: data1.dataExtenso();
                    
                    break;
                case 6: data1.ehBissexto(data1.getAno());
                    
                    break;
                case 7: clone(data1);
                    
                    break;
                case 0: System.exit(0);
                    
                    break;            
                default:
                System.out.println("Digite um número válido!!");
                    break;
            }

        } while (escolha != 0);


        
    }



    private static void clone(Data data1){
        Data dataClone = data1;
    }
    
    private static void compara(Data data1, Data data2){
        int dia1 = data1.getDia();
        int mes1 = data1.getMes();
        int ano1 = data1.getAno();
        int dia2 = data2.getDia();
        int mes2 = data2.getMes();
        int ano2 = data2.getAno();

        if ((ano1 == ano2) && (mes1 == mes2) && (data1 == data2) ) {
            System.out.println(0);
        } else if ((ano1 > ano2) || (ano1 == ano2 && mes1 > mes2) || (ano1 == ano2 && mes1 == mes2 && dia1 > dia2)) {
            System.out.println(1);
        }else{
            System.out.println(-1);
        }
    }
}
