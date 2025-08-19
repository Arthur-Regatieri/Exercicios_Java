public non-sealed class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customFee) {
        super(name,price);
        this.customsFee = customFee;
    }

    public Double totalPrice(){
        return price + customsFee;
    }

    @Override
    public String priceTag(){
        return name 
        + " $"
        + String.format("%.2f", totalPrice()) 
        + " (Customs fee: $" 
        + customsFee 
        + ")";
    }
}
