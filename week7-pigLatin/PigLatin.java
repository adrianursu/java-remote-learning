package main.java.iquest.com.pigLatin;

public class PigLatin {

    private StringBuilder converter;

    public PigLatin() {
        this.converter = new StringBuilder();
    }

    public String translate(String string) {

        String[] words = string.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            if (isVowel(words[i].toLowerCase().charAt(0))) {
                converter.append(words[i]);
            } else {
                converter.append(words[i].substring(1))
                        .append(words[i].substring(0, 1));
            }
            converter.append("ay ");
        }
        return converter.toString().trim();
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}