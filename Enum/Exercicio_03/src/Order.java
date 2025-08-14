import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private static DateTimeFormatter frmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private static DateTimeFormatter frmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDateTime moment;
    private OrderStatus status;
    private Client client;

    private List<OrderItem> items = new ArrayList<>();

    public Order(OrderStatus status, Client client) {
        this.status = status;
        this.client = client;
        moment = LocalDateTime.now();
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void remoeItem(OrderItem item){
        items.remove(item);
    }

    public Double total(){
        Double total = 0.0;
        for (OrderItem x : items) {
            total += x.subTotal();
        }
        return total;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY: \n");
        sb.append("Order moment: ");
        sb.append(frmt1.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(client.getName() + " (");
        sb.append(frmt2.format(client.getBirthDate()) + ") - ");
        sb.append(client.getEmail() + "\n");
        sb.append("Order items: " + "\n");

        for (OrderItem x : items) {
            sb.append(x + "\n");
        }
        sb.append("Total price: $" + String.format("%.2f", total()));

        return sb.toString();
    }
}
