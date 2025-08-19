public non-sealed class PessoaJuridica extends Contribuintes {

    private int numeroFuncionarios;

    public PessoaJuridica(String name, Double annualRevenue, int numeroFuncionarios) {
        super(name, annualRevenue);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public Double calculoImposto() {
        Double totalImposto = 0.0;
        if (numeroFuncionarios > 10) {
            totalImposto = annualRevenue * 0.14;
        }else{
            totalImposto = annualRevenue * 0.16;
        }
        return totalImposto;
    }
    
}
