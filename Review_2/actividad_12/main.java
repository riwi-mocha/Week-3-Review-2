import java.util.ArrayList;
import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> dictionary = new HashMap<String,ArrayList<String>>();
        ArrayList<String> speak = new ArrayList<>();
        speak.add("English: Speak");
        speak.add("Español: Hablar");
        speak.add("Portugues: falar");
        //-------------------------------------------------------------//
        ArrayList<String> walk = new ArrayList<>();
        walk.add("English: Walk");
        walk.add("Español: Caminar");
        walk.add("Portugues: Andar");
        // -------------------------------------------------------------//
        ArrayList<String> work = new ArrayList<>();
        work.add("English: Work");
        work.add("Español: Trabajar");
        work.add("Portugues: trabalhar");
        // -------------------------------------------------------------//
        dictionary.put("speak",speak);
        dictionary.put("walk", walk);
        dictionary.put("work", work);

        dictionary.forEach((key,value)-> {System.out.println("\n"+key.toUpperCase()+ ": "+ value);});

    }
}
