public class main {

    public static void main(String[] args) {
        CsvProcess CsvProcess = new CsvProcess();
        JsonProcess JsonProcess = new JsonProcess();

        CsvProcess.execute();
        CsvProcess.finish();
        JsonProcess.execute();
        JsonProcess.finish();
    }
}