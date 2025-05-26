public non-sealed class Gerente extends Colaborador {


    public void gerarRelatorio(){
        for(int i = 0; i < produtos.length; i++){
            if (venda[i]!= null) {
                System.out.println("Vendedor: " + venda[i] + "Produto: " + produtos[i] + "Valor: " + valor[i]);
                
            }
        }
        System.out.println("Total: " + total);
    }

    
    
}
