package main.java.iquest.com.storyTeller;

import java.util.Random;

public class StoryMaker {
    private static final String[] articles = {"the", "a", "one", "some", "any"};
    private static final String[] nouns = {"boy", "girl", "dog", "town", "car"};
    private static final String[] verbs = {"drove", "jumped", "ran", "walked", "skipped"};
    private static final String[] prepositions = {"the", "a", "to", "in", "of"};

    private StringBuilder stringBuilder;

    public StoryMaker() {
        this.stringBuilder = new StringBuilder();
    }

    public String createStory() {
      for(int i = 0; i < 20; i++) {
          int index1 = new Random().nextInt(5);
          int index2 = new Random().nextInt(5);
          int index3 = new Random().nextInt(5);
          int index4 = new Random().nextInt(5);
          int index5 = new Random().nextInt(5);
          int index6 = new Random().nextInt(5);

            stringBuilder.append(Character.toUpperCase(articles[index1].charAt(0)))
                    .append(articles[index1].substring(1))
                    .append(" ")
                    .append(nouns[index2])
                    .append(" ")
                    .append(verbs[index3])
                    .append(" ")
                    .append(prepositions[index4])
                    .append(" ")
                    .append(articles[index5])
                    .append(" ")
                    .append(nouns[index6])
                    .append(".");
        }
        return stringBuilder.toString();
    }
}
