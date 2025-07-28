public non-sealed class IngressoVip extends Ingresso {

    protected Double vip;
    
    public double IngressoVIP(){
        vip = imprimirValor() * 1.80;
        return vip;
    }

}
