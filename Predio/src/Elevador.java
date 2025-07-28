public class Elevador {
protected int andar = 0;
protected int andares, capacidade;
protected int qntpessoa = 0;
protected int pelevador = 0;



public Elevador(int andares, int capacidade){
this.andares = andares;
this.capacidade = capacidade;
}

public void inicalizar(){
System.out.println("O elevador tem a capacidade de " + this.capacidade + " pessoas e o prédio tem " + this.andares + " andares." );
}

public void entrar(){
    if (qntpessoa >= capacidade){
        System.out.println("O elevador suporta apenas " + capacidade + " pessoas, por favor, esperar o próximo!!!");
    }else{
        System.out.println("Uma pessoa entrou no elevador");
        qntpessoa ++;
    }
}

public void sair(){
    if (qntpessoa <= 0 ) {
        System.out.println("não há ninguém no elevador");
    }else{
        System.out.println("Uma pessoa saiu do elevador");
        qntpessoa --;
    }
}
public void subir(){
    if (andar == andares){
        System.out.println("Não é possível subir mais, pois o elevador já está no último andar");
    }else{
        andar ++;
        System.out.println("Elevador subindo...");
    }
}
public void descer(){
    if (andar == 0){
        System.err.println("O elevador já está no térreo, não é possível descer mais");;
    }else{
        andar --;
        System.out.println("Elevador descendo...");
    }
}
}