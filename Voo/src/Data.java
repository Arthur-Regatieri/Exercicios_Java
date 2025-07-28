public sealed class Data permits Voo {
    protected int dia;
    protected int mes;
    protected int ano;
    protected boolean mesgrande;
    
    public Data(int dia, int mes, int ano){
        if (ano < 0 ) {
            ano = 1;
        }
        
        if (mes < 0 || mes > 12) {
            mes = 1;           
        }
        if ((dia < 0 || dia > 31) || (dia == 31 && verificardiasMes(mes) == false) || (dia > 29 && mes == 2) || (dia == 29 && ehBissexto(ano) == false)) {
            dia = 1;
        }
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setDia(int dia) {
      
        this.dia = dia;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAno() {
        return ano;
    }
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }



    public void dataExtenso(){
        System.out.println(getDia() + "/" + getMes() + "/" + getAno());
    }


    public boolean verificardiasMes(int mes){
        if (mes <= 7 && mes%2 != 1) {
            return false;
        }
        if (mes >= 8 && mes%2 != 0) {
            return false;
        }
        return  true;
    }

    public static boolean ehBissexto(int ano) {
    if (ano % 400 == 0) {
        System.out.println("É ano bissexto");
        return true;      // Ex: 2000
    }
    if (ano % 100 == 0) {
        System.out.println("Não é ano bissexto");
        return false;     // Ex: 1900
    }
    if (ano % 4 == 0) {
        System.out.println("É ano bissexto");
        return true;      // Ex: 2024
    }
    return false;         // Ex: 2023
}
}
