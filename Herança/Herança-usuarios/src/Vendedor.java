import java.util.Scanner;

public non-sealed class Vendedor extends Colaborador {
    protected int product;
    protected String objeto;
    Scanner scanner = new Scanner(System.in);

    public void realizarVenda() {
        System.out.println("Digite o produto que deseja vender:");
        while (product < produtos.length) {
            for(int i = 0; i < produtos.length;i++){
                if (produtos[i] == null || produtos[i].equals("")) {
                    produtos[i] = scanner.next();
                    valor[i] = scanner.nextDouble();
                    venda[i] = name;
                    total += valor[i];
                    return;
                }
            }
            product++;
        }
        venda[product] = name;
        produtos[product] = scanner.next();
        valor[product] = scanner.nextDouble();
    }
}
