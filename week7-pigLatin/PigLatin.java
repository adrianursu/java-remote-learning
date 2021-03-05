package main.java.iquest.com.pigLatin;

public class PigLatin {

    private StringBuilder stringBuilder;

    public PigLatin() {
        this.stringBuilder = new StringBuilder();
    }

    public String convertToPigLatin(String string) {

        String[] words = string.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            if (isVowel(words[i].toLowerCase().charAt(0))) {
                stringBuilder.append(words[i])
                        .append("ay");
            } else {
                stringBuilder.append(words[i].substring(1))
                        .append(words[i].substring(0, 1))
                        .append("ay");
            }
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().trim();
    }

    private static boolean isVowel(char c) {
        if (c == 'a')
            return true;
        if (c == 'e')
            return true;
        if (c == 'i')
            return true;
        if (c == 'o')
            return true;
        if (c == 'u')
            return true;
        return false;
    }
}