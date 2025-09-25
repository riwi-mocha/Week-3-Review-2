public abstract class Employee {
    String id;
    String name;

    public Employee(){
        this.id = id;
        this.name = name;
    }

    abstract double monthlySalary();
}
 class FullTimeEmployee extends Employee implements Bonusable{
    double baseSalary;
    double bonus = 0.1;

    public FullTimeEmployee(double baseSalary){
        this.baseSalary = baseSalary;
    }
    @Override
    double monthlySalary() {
        return baseSalary;
    }

    @Override
    public double bonus() {
        return baseSalary * bonus;
    }
}

class HourlyEmployee extends Employee{
    double hours;
    double rate;
    public HourlyEmployee (double hours, double rate){
        this.hours = hours;
        this.rate= rate;
    }
    @Override
    double monthlySalary() {
        return hours * rate;
    }
}