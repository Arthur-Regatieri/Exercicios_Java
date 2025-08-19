public abstract sealed class Contribuintes permits PessoaFisica, PessoaJuridica {
    protected String name;
    protected Double annualRevenue;

    public Contribuintes(String name, Double annualRevenue) {
        this.name = name;
        this.annualRevenue = annualRevenue;
    }

    public String toString(){
        return name + ": $" + String.format("%.2f",calculoImposto());
    }

    public abstract Double calculoImposto();
}
