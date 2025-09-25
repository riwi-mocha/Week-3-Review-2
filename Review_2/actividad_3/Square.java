public class Square extends Shape {
   
    
    private double lado;

    public Square(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double area() {

        return lado * lado;
    }
}

class Circle extends Shape {
    
    private double radio;

    public Circle(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double area() {
        return 3.1416 * radio * radio;
    }
}