public class UpperCaseFormatter implements Formatter {
    @Override
    public String format(String s) {
        return s.toUpperCase();
    }
}

class LowerCaseFormatter implements Formatter {
    @Override
    public String format(String s) {
        return s.toLowerCase();
    }
}

class TitleCaseFormatter implements Formatter {
    @Override
    public String format(String s) {
        String[] words = s.toLowerCase().split(" ");
        String newS = "";

        for (String word : words) {
            if (!word.isEmpty()) {
                newS += Character.toUpperCase(word.charAt(0))
                        + word.substring(1)
                        + " ";
            }
        }
        return newS.trim();
    }
}
