public class Funcionario {
    protected String nome, sobrenome;
    protected double salario, anual;

    public Funcionario(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }
    
    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalario(double salario) {
        if (salario < 0) {
            this.salario = 0.0;
        }
        this.salario = salario;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void exibir(){
        this.anual = this.salario * 12;
        System.out.println("O funcionario " + getNome() + " tem o salário anual de R$"+ anual );
    }
    public void aumentar(){
        salario *= 1.10;
        System.out.println("O novo salário de " + getNome() + " é R$"+ salario);
    }
    
}
