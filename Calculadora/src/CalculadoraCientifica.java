import java.util.List;

public non-sealed class CalculadoraCientifica extends Calculadora{


    public Double raizQuadrada(List<Double> numero){
        resultado = Math.sqrt(numero.get(0));       
        return resultado;
    }
    
    public Double potencia(List<Double> numero, int n){
        resultado = Math.pow(numero.get(0), n);       
        return resultado;
    }
}