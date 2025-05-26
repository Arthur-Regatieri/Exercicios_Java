public non-sealed class Atendente extends Colaborador {

    protected double caixa;

    public void receberPagamento() {
        for(int i = 0; i < valor.length; i++){
            caixa = valor[i];
        }
        
    }
    public void fecharCaixa(){
        if (caixa == total) {
            System.out.println("Caixa está correto!!");
        }
    }
    
}
