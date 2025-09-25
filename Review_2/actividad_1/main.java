import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Operable> Operables= new ArrayList<>();
        Operables.add(new Fan());
        Operables.add(new Engine());

        for(Operable Operable : Operables){
            Operable.start();
            Operable.stop();
        }
    }
}
