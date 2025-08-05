public class Pessoas {
    private Double[] altura;
    private char[] genero;

    public Pessoas(int n){
        altura = new Double[n];
        genero = new char[n];
    }

    public void adicionar(int i, Double altura, char genero){
        this.altura[i] = altura;
        this.genero[i] = genero;
    }

    public Double menorAltura(){
        Double menAlt = altura[0];
        for (Double x : altura) {
            if (menAlt > x) {
                menAlt = x;
            }            
        }
        return menAlt;
    }

    public Double maiorAltura(){
        Double maiorAlt = 0.0;
        for (Double x : altura) {
            if (maiorAlt < x) {
                maiorAlt = x;
            }            
        }
        return maiorAlt;
    }

    public Double mediaF(){
        Double mediaFem = 0.0;
        int count = 0;
        for (int i = 0; i < altura.length; i++) {
            if (genero[i] == 'F') {
                mediaFem += altura[i];
                count++; 
            }
        }
        return mediaFem / (double) count;
    }

    public int numeroHomens(){
        int count = 0;
            for (char x : genero) {
                if (x == 'M') {
                    count++; 
                }
            }
        return count;
    }    
    
}
