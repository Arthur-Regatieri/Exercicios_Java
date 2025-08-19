public sealed class Employee permits OutsourcedEmployee {
    
    protected String name;
    protected Integer hours;
    protected Double valuePerHour;


    public Employee(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public Double payment(){
        return hours * valuePerHour;
    }
}
