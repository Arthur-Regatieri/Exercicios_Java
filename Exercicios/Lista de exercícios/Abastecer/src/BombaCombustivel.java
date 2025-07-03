import java.util.Scanner;

public class BombaCombustivel {
       protected final Double [] valorCombustivel = {5.60, 2.80, 7.90};
    protected Double [] qntCombustivel = {100.0, 100.0, 100.0};
    protected Double total;
    protected String [] tipoCombustivel = {"Gasolina", "Álcool", "Diesel"};
    protected String combustivel;
    protected int typegas = 0;
    protected Scanner scanner = new Scanner(System.in);
    
    public void checarBomba () {
        for(int i = 0; i < 3; i++){
            System.out.println("A bomba tem " + qntCombustivel[i] + " litros de " + tipoCombustivel[i] +"\n Cada litro de " 
            + tipoCombustivel[i] + " custa " + valorCombustivel[i]);
        }
        return;
    }

    public void abastecerPorValor (){
        System.out.println("Qual valor deseja colocar?");
        Double valorbastecer = scanner.nextDouble();
        this.total = valorbastecer / valorCombustivel[typegas];
        if (total > qntCombustivel[typegas]) {
            System.out.println("Não há está quantidade de combustível na bomba!!");
            return;         
        }
            System.out.println("Foi abastecido " + total + " litros de " + tipoCombustivel[typegas]);
            this.qntCombustivel[typegas] -= this.total;
        return;
    }

    public void abastecerPorLitro (){
        System.out.println("Deseja abastecer quantos litros?");
        double litrosAbastecer = scanner.nextDouble();
        if (litrosAbastecer > qntCombustivel[typegas]) {
            System.out.println("Não há está quantidade de combustível na bomba!!");
            return;         
        }
            this.total = litrosAbastecer * valorCombustivel[typegas];
            System.out.println("O cliente deverá pagar R$ " + total);
            this.qntCombustivel[typegas] -= litrosAbastecer;
        return;
    }

    public void alterarValor(){
        System.out.println("Para qual valor você deseja alterar a " + tipoCombustivel[typegas] + " ?");
        Double valor = scanner.nextDouble();
        if (valor <= 0) {
            System.out.println("O valor não pode ser igual ou menor que 0");
            return;
        }
            valorCombustivel[typegas] = valor;

    }

    public void alterarCombustivel(){
        System.out.println("Qual combustivel você deseja abastecer? \n G - Gasolina \n A - Álcool\n D - Diesel");
        combustivel = scanner.nextLine().toUpperCase();
        if (combustivel.equals("G")) {
            typegas = 0;            
            System.out.println("Combustível alterado para " + tipoCombustivel[typegas]);
        }else if (combustivel.equals("A")) {
            typegas = 1;
            System.out.println("Combustível alterado para " + tipoCombustivel[typegas]);
        }else if (combustivel.equals("D")) {
            typegas = 2;
            System.out.println("Combustível alterado para " + tipoCombustivel[typegas]);
        }
    }

    public void alterarQuantidadeCombustivel(){
        System.out.println("Deseja adicionar quantos litros de " + tipoCombustivel[typegas] + " na bomba?");
        double quantidade = scanner.nextDouble();
        qntCombustivel[typegas] += quantidade;
    }

}
