import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Contract {

    private static DateTimeFormatter frmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private int number;
    private LocalDate date;
    private Double totalValue;

    private List<Installment> installments = new ArrayList<>();
    
    public Contract(int number, LocalDate date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public void addInstallments(Installment installment){
        installments.add(installment);
    }

    public String showInstallments(){
        StringBuilder sb = new StringBuilder();
        for (Installment installment : installments) {
            sb.append(frmt1.format(installment.getDueDate()));
            sb.append(" - ");
            sb.append(installment.getAmount() + "\n");
        }
        return sb.toString();
    }
    
    
}
