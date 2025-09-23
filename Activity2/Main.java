package Activity2;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Calculable> operations = new ArrayList<>();
        operations.add(new Addition());
        operations.add(new Multiplication());   
        double a = 3;
        double b = 4;  
        for (Calculable operation : operations) {
            System.out.println("Result: " + operation.calculate(a, b));
        }
    }
}
