import java.time.LocalDate;

public class HourContract {
    private LocalDate date;
    private Double valuePerHour;
    private Integer hour;

    public HourContract(LocalDate date, Double valuePerHour, Integer hour) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hour = hour;
    }
    
    public LocalDate getDate() {
        return date;
    }

    public Integer getHour() {
        return hour;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }
    
    public Double totalValue(){
        return valuePerHour * hour;
    }
    
}
