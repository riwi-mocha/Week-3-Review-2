import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Calculable> calculables = new ArrayList<>();
        calculables.add(new Addition());
        calculables.add(new Multiplication());
        for (Calculable c : calculables) {
            System.out.println(c.calculate(3, 4));
        }

    }
}
