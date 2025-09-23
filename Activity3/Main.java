package Activity3;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Square(2));
        shapes.add(new Circle(10));
        shapes.add(new Square(20));

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.area());
        }
    }
}
