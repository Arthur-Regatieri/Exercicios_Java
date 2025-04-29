public class Comands {
    private boolean power = false;
    private int km = 0;
    private int march = 0;


    public int getMarch() {
        return march;
    }
    public int getKm() {
        return km;
    }
    public boolean isOff(){
        return power != true;
    }
    
    public void turnOn(){
        if (this.power) {
            System.out.println("O carro já está ligado");
            return;
        }
        this.power = true;
        System.out.println("Carro ligado!!!");
    }

    public void turnOff(){
        if (isOff()) {
            System.out.println("O carro está desligado");
            return;
        }
        if (this.march > 0 || this.km > 0) {
            System.out.println("O carro só pode ser desligado quando estiver parado.");
            return;
        }
        this.power = false;
        System.out.println("Carro desligado");
    }

    public void accelerate(){
        if (this.km >= 120) {
            System.out.println("Não é possível acelerar mais!!!");
            return;         
        }
        this.km += 1;
        System.out.println("Velocidade aumentada!");
    }

    public void reduce(){
        if (this.km <= 0) {
            System.out.println("Não é possível diminuir mais a velocidade!!!");
            return;       
        }
        this.km -= 1;
        System.out.println("Velocidade reduzida!");
    }

    public void turnRight(){
        if (isOff()) {
            System.out.println("O carro precisa ser ligado!!!");
            return;
        }
        if (this.km < 1 || this.km > 40) {
            System.out.println("Não é possível virar a direita");
            return;
        }
        System.out.println("Você virou a direita");
    }
    
    public void turnLeft(){
        if (isOff()) {
            System.out.println("O carro precisa ser ligado!!!");
            return;
        }
        if (this.km < 1 || this.km > 40) {
            System.out.println("Não é possível virar a esquerda");
            return;
        }
        System.out.println("Você virou a esquerda");
    }

    public void switchMarch(int march){
        switch (march) {
            case 0:System.out.println("A marcha foi alterada para o ponto morto");
                break;
            case 1: if (this.march < 1){
                        this.km = 1;
                    }else if (this.march == 2 && this.km == 21){
                        this.km = 20;
                    }else{
                        System.out.println("Não foi possível trocar de marcha");
                    return;
                    }
                    this.march = 1;
                    System.out.println("A marcha foi alterada para a " + getMarch() + " marcha");
                break;
            case 2: if (this.march == 1 && this.km == 20){
                        this.km = 21;
                    }else if(this.march == 3 && this.km == 41) {
                        this.km = 40;
                    }else{
                        System.out.println("Não foi possível trocar de marcha");
                    return;
                    }
                    this.march = 2;
                    System.out.println("A marcha foi alterada para a " + getMarch() + " marcha");
                break;
            case 3: if (this.march == 2 && this.km == 40){
                        this.km = 41;
                    }else if(this.march == 4 && this.km == 61) {
                        this.km = 60;
                    }else{
                        System.out.println("Não foi possível trocar de marcha");
                    return;
                    }
                    this.march = 3;
                    System.out.println("A marcha foi alterada para a " + getMarch() + " marcha");
                break;
            case 4: if (this.march == 3 && this.km == 60){
                        this.km = 61;
                    }else if(this.march == 5 && this.km == 81) {
                        this.km = 80;
                    }else{
                        System.out.println("Não foi possível trocar de marcha");
                    return;
                    }
                    this.march = 4;
                    System.out.println("A marcha foi alterada para a " + getMarch() + " marcha");
                break;
            case 5: if (this.march == 4 && this.km == 80){
                        this.km = 81;
                    }else if(this.march == 6 && this.km == 101) {
                        this.km = 100;
                    }else{
                        System.out.println("Não foi possível trocar de marcha");
                    return;
                    }
                    this.march = 5;
                    System.out.println("A marcha foi alterada para a " + getMarch() + " marcha");
                break;
            case 6: if (this.march == 5 && this.km == 100){
                        this.km = 101;
                    }else{
                        System.out.println("Não foi possível trocar de marcha");
                    return;
                    }
                    this.march = 6;
                    System.out.println("A marcha foi alterada para a " + getMarch() + " marcha");
                break;            
            default:System.out.println("Opção invalida");
                break;
        }
    }
}
