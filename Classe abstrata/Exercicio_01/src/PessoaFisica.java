public non-sealed class PessoaFisica extends Contribuintes {

    private Double healthCare;

    public PessoaFisica(String name, Double annualRevenue, Double healthCare) {
        super(name, annualRevenue);
        this.healthCare = healthCare;
    }

    @Override
    public Double calculoImposto() {
        Double totalImposto = 0.0;
        if (annualRevenue < 20000) {
            totalImposto = annualRevenue * 0.15;
        }else{
            totalImposto = annualRevenue * 0.25;
        }

        if (healthCare > 0) {
            totalImposto -= (healthCare*0.5);
        }
        return totalImposto;
    }
    
}
