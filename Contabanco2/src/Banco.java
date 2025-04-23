import java.util.Scanner;

public class Banco {
    public static void main(String[] args) throws Exception {
       // System.out.println("O cliente " + conta.getNome() + " tem R$" + conta.getSaldo() + ",00 na conta");
        Scanner scanner = new Scanner(System.in);
        var option = -1;

        System.out.println("Crie uma conta: ");
                    String nome = scanner.next();
                    while (nome == null || nome.isEmpty()) {
                        System.out.println("Digite um nome: ");
                        nome = scanner.next();
                    }
                    System.out.println("Deposite um valor: ");
                    Double valor = scanner.nextDouble();
                    Conta conta = new Conta(nome,valor);


        do {
            System.out.println("=== Escolha uma das opções ===");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Consultar Cheque Especial");
            System.out.println("3 - Depositar Dinheiro");
            System.out.println("4 - Sacar Dinheiro");
            System.out.println("5 - Pagar um Boleto");
            System.out.println("6 - Verificar se a conta está utilizando o Cheque Especial");
            System.out.println("0 - Sair");
            option = scanner.nextInt();
        
        switch (option) {
           
            case 1: 
                System.out.println("A conta " + conta.getNome() + " tem R$ " + conta.getSaldo() + ",00");

                break;
            case 2:
                System.out.println("A conta " + conta.getNome() + " tem disponível R$ " + (conta.getChequeEspecial() - conta.getValorGastoChequeEspecial()) + ",00 de Cheque especial");
                break;
            case 3:
                System.out.println("Valor do deposito:");
                double deposito = scanner.nextDouble();
                conta.Depositar(deposito);
                break;
            case 4:
                System.out.println("Valor que irá sacar:");
                double saque = scanner.nextDouble();
                conta.Sacar(saque);
                break;
            case 5:
                System.out.println("Valor do boleto:");
                double boleto = scanner.nextDouble();
                conta.PagarBoleto(boleto);

                break;
            case 6:
                if(conta.getValorGastoChequeEspecial() !=0){
                    System.out.println("A conta " + conta.getNome() + " está utilizando R$ " + conta.getValorGastoChequeEspecial() + ",00 de Cheque especial");
                }else{
                    System.out.println("A conta " + conta.getNome() + " não está utilizando o cheque especial");
                }
                break;
            case 0:
                System.exit(0);
                break;
            default: System.out.println("Opção inválida");
                break;
        }
        

        if(conta.getValorGastoChequeEspecial() !=0){
            System.out.println("Devido a utilização do cheque especial, está sendo cobrado uma taxa de 20% equivalente a R$ " + (conta.getValorGastoChequeEspecial()* 0.2) + ",00");
            }

        } while (true);

    }

    
}
