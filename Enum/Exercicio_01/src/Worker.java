import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;   
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
        }

    public Double income(Integer year, Integer month){
        Double sum = baseSalary;
        for (HourContract x : contracts) {
            if ((x.getDate().getYear() == year) && (x.getDate().getMonthValue() == month)) {
                sum += x.totalValue();                
            }            
        }
        return sum;
    }
}
