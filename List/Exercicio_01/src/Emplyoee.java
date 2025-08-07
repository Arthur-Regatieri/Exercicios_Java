public class Emplyoee {
    private int id;
    private String name;
    private Double salary;

    public Emplyoee(int id, String name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void aumento(Double percentage){
        this.salary *= ((percentage/100) + 1);
    }

    public String toString(){
        return id + ", " + name + ", "+ String.format("%.2f", salary);
    }
}

