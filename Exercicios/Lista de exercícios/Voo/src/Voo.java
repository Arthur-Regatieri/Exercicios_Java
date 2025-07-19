import java.util.ArrayList;

public non-sealed class Voo extends Data {

    protected int passageiro;
    
    protected ArrayList<Integer> vagas = new ArrayList<>();
    protected int nVoo;
    protected int cLivre;


    public Voo(int nVoo, int dia, int mes, int ano){
        super(dia, mes, ano);
        this.nVoo = nVoo;
    }

    @Override
    public void setAno(int ano) {
        // TODO Auto-generated method stub
        super.setAno(ano);
    }
    @Override
    public void setDia(int dia) {
        // TODO Auto-generated method stub
        super.setDia(dia);
    }
    @Override
    public void setMes(int mes) {
        // TODO Auto-generated method stub
        super.setMes(mes);
    }
    public void setPassageiro(int passageiro) {
        this.passageiro = passageiro;
    }
    public void setVagas(ArrayList<Integer> vagas) {
        this.vagas = vagas;
    }
    public void setnVoo(int nVoo) {
        this.nVoo = nVoo;
    }
    @Override
    public int getAno() {
        // TODO Auto-generated method stub
        return super.getAno();
    }
    @Override
    public int getDia() {
        // TODO Auto-generated method stub
        return super.getDia();
    }
    @Override
    public int getMes() {
        // TODO Auto-generated method stub
        return super.getMes();
    }
    public int getPassageiro() {
        return passageiro;
    }
    public ArrayList<Integer> getVagas() {
        return vagas;
    }
    public int getnVoo() {
        return nVoo;
    }

    

    public void proximoLivre() {
        for (int assento = 1; assento <= 100; assento++) {
            boolean ocupado = false;
            for (int i = 0; i < vagas.size(); i++) {
                if (vagas.contains(assento)) {
                    ocupado = true;
                    break;
                }
            }
        if (!ocupado) {
            System.out.println("O assento n°" + assento + " está livre");
            return;
        }
    }
    System.out.println("Todos os assentos estão ocupados");
}


public void ocupa(int assento){
    if (this.vagas.size() >= 100){
        System.out.println("Este voo está lotado!!!");
        return;
        }
    if (vagas.contains(assento)){
        System.out.println("Este assento já está ocupado");
        return;
    }
    if (assento < 1 || assento > 100){
        System.out.println("O avião tem de 1 a 100 assentos, escolha um assento nesta faixa!");
        return;
    }
    vagas.add(assento);
    System.out.println("Assento escolhido com sucesso!!!");
}

public void verifica(int nCadeira){
    if (nCadeira < 1 || nCadeira > 100) {
        System.out.println("Escolha um assento entre 1 e 100");
        return;
    }
    for (int i = 0; i < vagas.size(); i++){
        
        if (vagas.contains(nCadeira)){
            System.out.println("Esta cadeira está ocupada");
            return;
        }else{
            System.out.println("O assento escolhido está disponível");
            return;
        }
    }
    }

    public int vagasDisponiveis(){
        return 100 - vagas.size();
    }


}
