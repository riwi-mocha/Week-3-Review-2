import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Formatter> formatter = new ArrayList<>();
        String text = "Probando los formatters";
        formatter.add(new UpperCaseFormatter());
        formatter.add(new LowerCaseFormatter());
        formatter.add(new TitleCaseFormatter());
        for (Formatter formatte : formatter) {
            System.out.println(formatte.format(text));
        }
    }
}
