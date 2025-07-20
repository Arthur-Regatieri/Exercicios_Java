import java.util.ArrayList;
import java.util.List;

public sealed class Calculadora permits CalculadoraCientifica {
    List<Double> numeros = new ArrayList<>();
    Double resultado = 0.0;

    public double somar(List<Double> numeros){
        for(Double operacao: numeros){
            resultado += operacao;
        }

        return resultado;
        
    }
    public double subtrair(List<Double> numeros){
        for(Double operacao: numeros){
            if (resultado == 0.0) {
                resultado = operacao;                
            }else{
            resultado -= operacao;
            }
        }

        return resultado;
        
    }
    public double multiplicar(List<Double> numeros){
        for(Double operacao: numeros){
            if (resultado == 0.0) {
                resultado = operacao;                
            }else{
            resultado *= operacao;
            }
        }

        return resultado;
        
    }
    public double dividir(List<Double> numeros){
        for(Double operacao: numeros){
            if (resultado == 0.0) {
                resultado = operacao;                
            }else{
            resultado /= operacao;
            }
        }

        return resultado;
        
    }
}
