import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        FullTimeEmployee employee1 = new FullTimeEmployee(10000);
        FullTimeEmployee employee2 = new FullTimeEmployee(12000);
        HourlyEmployee employee3 = new HourlyEmployee(8, 7000);
        HourlyEmployee employee4 = new HourlyEmployee(6, 7500);
        employee1.name = "pepe";
        employee1.id = "123";

        employee2.name = "pepa";
        employee2.id = "456";

        employee3.name = "pablo";
        employee3.id = "789";

        employee4.name = "carmen";
        employee4.id = "101";

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        for (Employee employee : employees) {
            if (employee instanceof FullTimeEmployee) {
                System.out.println("ID: " + employee.id + " - Nombre: " + employee.name + " - Salario base: "+ employee.monthlySalary() + " - Bono: "+ (employee.monthlySalary() * ((FullTimeEmployee) employee).bonus )+ " - Total: "  +(employee.monthlySalary() + ((FullTimeEmployee) employee).bonus()));
                        
                        
                      
            }else{
                System.out.println("ID: " + employee.id + " - Nombre: " + employee.name + " - Salario base: "
                        + employee.monthlySalary());
            }
        }

    }
}
