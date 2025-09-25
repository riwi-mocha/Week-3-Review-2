public class Engine implements Operable{
    @Override
    public void start() {
    System.out.println("Class Engine Star");

    }

    @Override
    public void stop() {
        System.out.println("class Engine Stop");

    }

}
    
class Fan implements Operable{
@Override
public void start() {
    System.out.println("Class Fan Star");
    
}

@Override
public void stop() {
    System.out.println("class Fan Stop");
    
}
    
}