import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Funcionario [] fun = new Funcionario[2];
        Funcionario fun1 = new Funcionario("Arthur", "Regatieri", 3100.00);
        Funcionario fun2 = new Funcionario("Julia", "Ramos", 3600.00);
        fun[0] = fun1;
        fun[1] = fun2;
        for(int i = 0; i < 2; i++){
            fun[i].exibir();
            fun[i].aumentar();
        }

    }

}
