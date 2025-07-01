import java.time.LocalDate;

public class Pessoa  {
    private String name;
    private String date;
    private Double altura;
    private int idade;
    private int ano;
    private LocalDate data = LocalDate.now();
    private int anoAtual = data.getYear();

    public Pessoa(String name, String date, Double altura) {
        this.name = name;
        this.date = date;
        this.altura = altura;
    }

    public void Dados() {
        System.out.println("A pessoa cadastrada se chama " + this.name + " tem " + altura + " de altura e nasceu em " + date);
    }
    public int CalcularIdade(){
        this.ano = Integer.parseInt(this.date.substring(6)); 
        this.idade = this.anoAtual - this.ano;
        return idade;
    }

    public Double getAltura() {
        return altura;
    }
    public String getDate() {
        return date;
    }
    public String getName() {
        return name;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setName(String name) {
        this.name = name;
    }
}
