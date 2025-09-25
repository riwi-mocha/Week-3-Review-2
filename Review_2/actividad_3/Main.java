import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
         ArrayList<Shape> shapes = new ArrayList<>();
        Square obj1= new Square(4);
        Square obj2 = new Square(5);
        Circle obj3 = new Circle(3);
        Circle obj4 = new Circle(4);
        shapes.add(obj1);
        shapes.add(obj2);
        shapes.add(obj3);
        shapes.add(obj4);

        for (Shape shape : shapes) {
            System.out.println("area: " + shape.area());
        }
    }
}
