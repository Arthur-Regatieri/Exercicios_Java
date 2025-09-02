import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> candidatos = new TreeMap<>();
        System.out.println("Enter file full path: ");
        String path = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String[] dados = line.split(",");
                String nome = dados[0];
                int votos = Integer.parseInt(dados[1]);

                if (candidatos.containsKey(nome)) {
                    votos += candidatos.get(nome);
                }
                candidatos.put(nome,votos);

                line = br.readLine();
            }
            
        } catch (IOException e) {
            // TODO: handle exception
        }

        for (String key : candidatos.keySet()) {
            System.out.println(key + ": " + candidatos.get(key));
            
        }


    }
}
