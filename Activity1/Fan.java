public class Fan implements Operable {

    @Override
    public void start() {
        System.out.println("Fan started");
    }

    @Override
    public void stop() {
        System.out.println("Fan stopped");
    }
    
}
