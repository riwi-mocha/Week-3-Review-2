public class CsvProcess extends Process{
    @Override
    public void process() {
        System.out.println("CsvProcess process");
        
    }
    @Override
    public void prepare() {
        System.out.println("CsvProcess prepare");
        
    }
}

class JsonProcess extends Process {
    @Override
    public void process() {
        System.out.println("JsonProcess process");

    }

    @Override
    public void prepare() {
        System.out.println("JsonProcess prepare");

    }
}
