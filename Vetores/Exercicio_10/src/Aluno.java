public class Aluno {
    private String[] nomes;
    private Double[] n1;
    private Double[] n2;

    public Aluno(int n){
        nomes = new String[n];
        n1 = new Double[n];
        n2 = new Double[n];
    }

    public void adicionarAluno(int n, String nome, Double n1, Double n2){
        this.nomes[n] = nome;
        this.n1[n] = n1;
        this.n2[n] = n2;
    }

    public void aprovados(){
        for (int i = 0; i < n1.length; i++) {
            if ((n1[i] + n2[i])/ 2 >= 6.0) {
                System.out.println(nomes[i]);
            }
        }
    }

}
