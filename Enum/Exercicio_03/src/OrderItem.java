import java.util.ArrayList;
import java.util.List;

public class OrderItem {
    private Integer quantity;
    private Double price;
    private Product product;

    //private List<Product> product = new ArrayList<>();
    public OrderItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.product = product;       
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double subTotal(){
        price = quantity * product.getPrice();
        return price;
    }

    public String toString(){
        return product.getName() 
        + ", $" 
        + String.format("%.2f", product.getPrice()) 
        + ", Quantity: " 
        + quantity 
        + ", Subtotal: " 
        + String.format("%.2f",subTotal()); 
    }
}
