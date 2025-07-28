public class Pessoas {
    protected String nome;
    protected int idade;
    protected float altura;

    public float getAltura() {
        return altura;
    }
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }

    public Pessoas(String nome, int idade, float altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
}
