import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public non-sealed class UsedProduct extends Product {
    private LocalDate manufactureDate;
    private static DateTimeFormatter frmt1= DateTimeFormatter.ofPattern("dd/MM/YYYY");

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name,price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        return name 
        + " (used) $"
        + String.format("%.2f", price) 
        + " (Manufacture date: "
        + frmt1.format(manufactureDate) 
        +")";
    }
}
