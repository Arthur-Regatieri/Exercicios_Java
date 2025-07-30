public class Altura {
    private Double [] alturas;
    private int [] idades;
    private String [] nomes;
    private int[] indexs;

    public Altura(int n){
        alturas = new Double[n];
        idades = new int[n];
        nomes = new String[n];
        indexs = new int[n];
    }
    

    public void adicionarPessoa(int index, String nome, int idade, Double altura){
        alturas[index] = altura;
        idades[index] = idade;
        nomes[index] = nome;
    }

    public Double alturaMedia(){
        Double media = 0.0;
        for (Double alt : alturas) {
            media += alt;
        }
        return media/alturas.length;
    }

    public Double subIdade(){
        int count = 0;
        for (int i = 0; i < idades.length; i++) {
        if (idades[i] < 16) {
            indexs[count] = i;
            count++;
        }         
    }
        return ((count / (double) idades.length) * 100);
    }

    public void menorIdade(){
        for(int i = 0; i < nomes.length; i++){
            if (i == indexs[i]) {
                System.out.println(nomes[i]);
            }   
        }
    }
}