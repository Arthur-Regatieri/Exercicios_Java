import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int option;
        Colaborador gerente = new Gerente();
        Colaborador funcionario = new Vendedor();

        do {
            System.out.println("=== Escolha uma das opções ===");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Realizar Login");
            System.out.println("0 - Sair");
            option = scanner.nextInt();
            
            switch (option) {
           
                case 1: if (gerente instanceof Gerente gen) {
                    gen.criarLogin();
                }
                    break;
                case 2:if ((gerente instanceof Gerente gen) || (gerente instanceof Atendente aten) || (gerente instanceof Vendedor vend)) {
                    gerente.realizarLogin();
                    if (gerente.on) {
                        segundaOpcao(gerente);                   
                    }                     
                    }
                    break;
                case 0:
                System.exit(0);
                    break;
                default: System.out.println("Opção inválida");
                    break;
        }
        

        } while (true);

    }

    public static void segundaOpcao(Colaborador colaborador) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("=== Escolha uma das opções ===");
         System.out.println("1 - Alterar Dados");
         System.out.println("2 - Alterar senha");
         System.out.println("3 - Realizar logoff");

        switch (colaborador.atribuicao) {
            case "Gerente":
                System.out.println("4 - Gerar relatório financeiro");
                System.out.println("5 - Consultar Vendas");
                break;
            case "Vendedor":
                System.out.println("4 - Realizar Venda");
                System.out.println("5 - Consultar Vendas");                               
                break;
            case "Atendente":
                System.out.println("4 - Receber pagamentos");
                System.out.println("5 - Fechar o caixa");                                
                break;
        
            default:
                break;
                        }
                int option2 = scanner.nextInt(); 

            switch (option2) {
                case 1:colaborador.alterarDados();
                    
                    break;
                case 2: colaborador.alterarSenha();
                    
                    break;
                case 3:colaborador.realizarLogff();
                    
                    break;
                case 4:
                    if (colaborador.atribuicao.equals("Gerente")) {
                        ((Gerente) colaborador).gerarRelatorio();
                    } else if (colaborador.atribuicao.equals("Vendedor") && colaborador instanceof Vendedor ven) {
                        ven.realizarVenda();
                    } else if (colaborador.atribuicao.equals("Atendente") && colaborador instanceof Atendente aten) {
                        aten.receberPagamento();
                    }
                    break;
                case 5:if (colaborador.atribuicao.equals("Gerente") || colaborador.atribuicao.equals("Vendedor")) {
                    colaborador.consultarVendas();
                }else if (colaborador instanceof Atendente aten) {
                        aten.fecharCaixa();
                }     
                    break;                                                                                        

                default:
                    break;
            }                        
        
    }
}
