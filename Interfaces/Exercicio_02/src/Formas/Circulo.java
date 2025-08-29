package Formas;

public class Circulo implements Forma {

    private Double raio;

    public Circulo(Double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calcularPerimetro() {
       return 2 * Math.PI * raio;
    }

    @Override
    public String getNome() {
        return "Circulo";
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    
    
}
