public class Addition implements Calculable {

    @Override
    public double calculate(double a, double b) {
        return a + b;
    }

}

class Multiplication implements Calculable {

    @Override
    public double calculate(double a, double b) {
        return a * b;
    }

}
