public class Matricula {
    protected String nome;
    protected int matricula;
    protected double n1, n2, t1, total;

    public Matricula(String nome, double n1, double n2, double t1){
        this.nome = nome;
        this.t1 = t1;
        this.n1 = n1;
        this.n2 = n2;
    }

    public void media(){
        total = (t1*2 + n1*2.5 + n2*2.5)/3;
        System.out.println("A média de "+ nome + " é "+ total);
    }
    public void rec(){
        
    }
    
}
