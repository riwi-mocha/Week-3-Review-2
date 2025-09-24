package Activity4;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Testing CsvProcess ---");
        CsvProcess csv = new CsvProcess();
        csv.execute();
        
        System.out.println("\n--- Testing JsonProcess ---");
        JsonProcess json = new JsonProcess();
        json.execute();
    }
}