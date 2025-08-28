import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o caminho do arquivo que deseja ler:");
        String caminho = scanner.nextLine();
        

        List<Produto> produtos = new ArrayList<>();

        try( BufferedReader br = new BufferedReader(new FileReader(caminho))){
            String line = br.readLine();

            while (line != null){
                System.out.println(line);
                String[] produto = line.split(",");
                String name = produto[0];
                Double price = Double.parseDouble(produto[1]);
                Integer quantity = Integer.parseInt(produto[2]);

                produtos.add(new Produto(name, price, quantity));

                line = br.readLine();
            }
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        
        Boolean success = new File("E:\\Teste" + "\\out").mkdir();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\Teste\\out\\" + "summary.csv",true))) {
            for (Produto produto : produtos) {
                
                bw.write(produto.getName() + "," + produto.total());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
