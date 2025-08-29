package Formas;

public class Triangulo implements Forma{

    private Double base, height;

        public Triangulo(Double base, Double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calcularArea() {
       return base * height / 2;
    }

    @Override
    public double calcularPerimetro() {
        double hipotenusa = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        return base + height + hipotenusa;
    }

    @Override
    public String getNome() {
        return "Tringulo";
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    
    
}
