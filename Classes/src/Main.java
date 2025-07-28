public class Main {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa("Arthur","14/12/2000",1.78);
        pessoa.Dados();
        System.out.println("O " +  pessoa.getName() + " tem "+ pessoa.CalcularIdade() + " anos de idade");;
    }
}
