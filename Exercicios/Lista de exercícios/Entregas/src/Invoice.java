public class Invoice {
    protected int item, qntd;
    protected double valor, total;
    protected String description;

    public Invoice(int item, int qntd, double valor, String description) {
        this.item = item;
        this.qntd = qntd;
        this.valor = valor;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    public int getItem() {
        return item;
    }
    public int getQntd() {
        return qntd;
    }
    public double getValor() {
        return valor;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setItem(int item) {
        this.item = item;
    }
    public void setQntd(int qntd) {
        this.qntd = qntd;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public void getInvoiceAmount(){
        total = valor * qntd;
        System.out.println("O valor total para a compra de "+ getQntd()+ " " + getDescription() + "s é de R$"+ total + "0");
    }
}
