import java.util.ArrayList;
import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        HashMap<String, Integer> countColors = new HashMap<>();
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Rojo");
        colors.add("Blanco");
        colors.add("Azul");
        colors.add("Amarillo");
        colors.add("Negro");
        colors.add("Verde");
        colors.add("Rojo");
        colors.add("Negro");
        colors.add("Rojo");
        colors.add("Negro");
        for (String color : colors) {
            if (countColors.containsKey(color)) {
                countColors.put(color, countColors.get(color) + 1);
            } else {
                countColors.put(color, 1);
            }
        }
        for (String color : countColors.keySet()) {
            System.out.println(
                    "Color: " + color.toUpperCase() + (countColors.get(color) > 2 ? " * - Cantidad de veces en el HashMap: " + countColors.get(color) : " - Cantidad de veces en el HashMap: " + countColors.get(color)));
        }

    }
}
