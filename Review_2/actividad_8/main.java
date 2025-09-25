import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Document> documents = new ArrayList<>();
        Book book1 = new Book("Java", 150);
        Book book2 = new Book("Pyhton", 120);
        Magazine magazine1 = new Magazine("Html", 90);
        Magazine magazine2 = new Magazine("JavaScript", 140);

        documents.add(book1);
        documents.add(book2);
        documents.add(magazine1);
        documents.add(magazine2);

        for (Document document : documents){
            if(document.pages() >= 100){
                System.out.println(document.title + " - Numero de paginas: " + document.pages());
            }
        }


        
    }
}
