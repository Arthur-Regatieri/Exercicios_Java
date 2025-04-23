public class Conta {
    private final String nome;
    private double saldo;
    private final double chequeEspecial;
    private double valorGastoChequeEspecial = 0;
    private double deposito;

    public Conta(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
        if (this.saldo <= 500){
            this.chequeEspecial = 50;
        }else{
            this.chequeEspecial = 0.5 * this.saldo;
        }
        
    }
    public void Sacar(double saque){
        if (saque > this.saldo) {
            System.out.println("Saldo insuficiente.");
        }else{
            this.saldo -= saque;
            System.out.println("Saque realizado com sucesso");
        }
    
    }
    public void Depositar(double deposito){
        this.deposito = deposito;
        this.saldo += this.deposito;
        System.out.println("Deposito realizado com sucesso");
    }

    public void PagarBoleto(double boleto){
        if (getSaldo() + getChequeEspecial() < boleto){
            System.out.println("Saldo insuficiente");
        }else if(getSaldo() < boleto && getSaldo() + getChequeEspecial() >= boleto){
        
            this.valorGastoChequeEspecial = boleto - this.saldo;
            this.saldo -= boleto;
            
        }else{
            this.saldo -= boleto;
        }
    }

    public double getDeposito() {
        return deposito;
    }

    public String getNome() {
        return nome;
    }
    public double getSaldo() {
        return saldo;
    }
    public double getChequeEspecial() {
        return chequeEspecial;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getValorGastoChequeEspecial() {
        return valorGastoChequeEspecial;
    }
}
