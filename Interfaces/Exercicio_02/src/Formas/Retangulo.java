package Formas;
public class Retangulo implements Forma {

    private Double base, height;

    public Retangulo(Double base, Double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calcularArea() {
        return base * height;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + height);
    }

    @Override
    public String getNome() {
      return "Retânagulo";
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
