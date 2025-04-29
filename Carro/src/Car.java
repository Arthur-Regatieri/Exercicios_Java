import java.util.Scanner;

public class Car {
    private final static Scanner scanner = new Scanner(System.in);

    private final static Comands comands = new Comands();
    private static int march = 0;
    public static void main(String[] args) throws Exception {
        var option = -1;     


        do {
            System.out.println("=== Escolha uma das opções ===");
            System.out.println("1 - Ligar o carro");
            System.out.println("2 - Desligar o carro");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Desacelerar");
            System.out.println("5 - Virar a direita");
            System.out.println("6 - Virar a esquerda");
            System.out.println("7 - Verificar velocidade");
            System.out.println("8 - trocar marcha");
            System.out.println("0 - Sair");
            option = scanner.nextInt();
        
        switch (option) {
           
            case 1:comands.turnOn();
                break;
            case 2:comands.turnOff();
                break;
            case 3:accelerate();
                break;
            case 4:reduce();
                break;
            case 5:comands.turnRight();
                break;
            case 6:comands.turnLeft();
                break;
            case 7:checkVelocity();
                break;
            case 8:switchMarch();
                break;
            case 0:
                System.exit(0);
                break;
            default: System.out.println("Opção inválida");
                break;
        }
        

        } while (true);

    }

    public static void checkVelocity() {
        if (comands.isOff()) {
            System.out.println("O carro está desligado");
        }else{
        var velocity = comands.getKm();
        System.out.println("A velocidade atual é " + velocity + "km/h");
        }
    }

    public static void switchMarch(){
        if (comands.isOff()) {
            System.out.println("O carro está desligado");
        }else{
        System.out.println("Escolha a marcha");
        march = scanner.nextInt();
        comands.switchMarch(march);
        }
    } 
    public static void accelerate(){
        var velocity = comands.getKm();
        if (comands.isOff()) {
            System.out.println("O carro está desligado");
            return;
        }
        if (march == 0 && velocity == 0) {
            System.out.println("Troque a marcha");
            return;
        }
        if (march == 1 && velocity == 20) {
            System.out.println("Troque a marcha");
            return;
        }
        if (march == 2 && velocity == 40) {
            System.out.println("Troque a marcha");
            return;
        }
        if (march == 3 && velocity == 60) {
            System.out.println("Troque a marcha");
            return;
        }
        if (march == 4 && velocity == 80) {
            System.out.println("Troque a marcha");
            return;
        }
        if (march == 5 && velocity == 100) {
            System.out.println("Troque a marcha");
            return;
        }
        comands.accelerate();
    }

    public static void reduce(){
        var velocity = comands.getKm();
        if (comands.isOff()) {
            System.out.println("O carro está desligado");
            return;
        }
        if (march == 1 && velocity == 1) {
            System.out.println("Coloque o carro em ponto morto");
            return;
        }
        if (march == 2 && velocity == 21) {
            System.out.println("Troque a marcha");
            return;
        }
        if (march == 3 && velocity == 41) {
            System.out.println("Troque a marcha");
            return;
        }
        if (march == 4 && velocity == 61) {
            System.out.println("Troque a marcha");
            return;
        }
        if (march == 5 && velocity == 81) {
            System.out.println("Troque a marcha");
            return;
        }
        if (march == 6 && velocity == 101) {
            System.out.println("Troque a marcha");
            return;
        }
        comands.reduce();
    }

}
