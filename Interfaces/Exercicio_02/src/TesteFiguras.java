import Formas.Circulo;
import Formas.Forma;
import Formas.Retangulo;
import Formas.Triangulo;

public class TesteFiguras {
    public static void main(String[] args) {
       
        Forma retangulo = new Retangulo(5.0, 3.0);
        Forma circulo = new Circulo(4.0);
        Forma triangulo = new Triangulo(6.0, 8.0);
        
        Forma[] formas = {retangulo, circulo, triangulo};
        
        System.out.println("=== INFORMAÇÕES DAS FORMAS GEOMÉTRICAS ===\n");
        
        for (Forma forma : formas) {
            exibirInformacoes(forma);
            System.out.println("-".repeat(40));
        }
        
        System.out.println("\n=== DEMONSTRAÇÃO DE POLIMORFISMO ===");
        double areaTotal = calcularAreaTotal(formas);
        System.out.printf("Área total de todas as formas: %.2f\n", areaTotal);
        
        Forma maiorForma = encontrarMaiorArea(formas);
        System.out.printf("Forma com maior área: %s (%.2f)\n", 
                         maiorForma.getNome(), maiorForma.calcularArea());
    }
    
    private static void exibirInformacoes(Forma forma) {
        System.out.println("Forma: " + forma.getNome());
        System.out.printf("Área: %.2f\n", forma.calcularArea());
        System.out.printf("Perímetro: %.2f\n", forma.calcularPerimetro());
        
        // Informações específicas de cada tipo usando instanceof
        if (forma instanceof Retangulo) {
            Retangulo r = (Retangulo) forma;
            System.out.printf("Dimensões: %.2f x %.2f\n", r.getBase(), r.getHeight());
        } else if (forma instanceof Circulo) {
            Circulo c = (Circulo) forma;
            System.out.printf("Raio: %.2f\n", c.getRaio());
        } else if (forma instanceof Triangulo) {
            Triangulo t = (Triangulo) forma;
            System.out.printf("Base: %.2f, Altura: %.2f\n", t.getBase(), t.getHeight());
        }
        
        System.out.println();
    }
    
    private static double calcularAreaTotal(Forma[] formas) {
        double total = 0.0;
        for (Forma forma : formas) {
            total += forma.calcularArea();
        }
        return total;
    }
    
    private static Forma encontrarMaiorArea(Forma[] formas) {
        Forma maior = formas[0];
        for (int i = 1; i < formas.length; i++) {
            if (formas[i].calcularArea() > maior.calcularArea()) {
                maior = formas[i];
            }
        }
        return maior;
    }
}