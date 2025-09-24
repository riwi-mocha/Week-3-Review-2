package Activity6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IndexWithHashMap {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Samuel");
        words.add("Raul");
        words.add("Samuel");
        words.add("Polo Polo");
        words.add("Samuel");
        words.add("Polo Polo");
        words.add("Elon Musk");
        words.add("Raul");
        
        HashMap<String, Integer> wordFrequencies = new HashMap<>();
        for (String word : words) {
            wordFrequencies.put(word, wordFrequencies.getOrDefault(word, 0) + 1);
        }

        System.out.println("Frecuencias de las palabras:");
        for (Map.Entry<String, Integer> entry : wordFrequencies.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            if (count > 2) {
                System.out.println(word + ": " + count + " *");
            } else {
                System.out.println(word + ": " + count);
            }
        }
    }
}