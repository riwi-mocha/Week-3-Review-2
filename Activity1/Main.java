import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
            ArrayList<Operable> InterfaceList = new ArrayList<>();
            InterfaceList.add(new Fan());
            InterfaceList.add(new Engine());
            for (Operable device : InterfaceList) {
                device.start();
                device.stop();
            }
    }
}
