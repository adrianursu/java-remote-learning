package main.java.iquest.com.storyTeller;

import java.util.Random;

public class StoryMaker {
    private static final String[] articles = {"the", "a", "one", "some", "any"};
    private static final String[] nouns = {"boy", "girl", "dog", "town", "car"};
    private static final String[] verbs = {"drove", "jumped", "ran", "walked", "skipped"};
    private static final String[] prepositions = {"to", "from", "over", "under", "on"};

    private StringBuilder stringBuilder;
    private Random random;

    public StoryMaker() {
        this.stringBuilder = new StringBuilder();
        this.random = new Random();
    }

    public String getStory() {
        for (int i = 0; i < 20; i++) {
            int firstWordIndex = random.nextInt(5);

            stringBuilder.append(Character.toUpperCase(articles[firstWordIndex].charAt(0)))
                    .append(articles[firstWordIndex].substring(1))
                    .append(" ")
                    .append(nouns[random.nextInt(5)])
                    .append(" ")
                    .append(verbs[random.nextInt(5)])
                    .append(" ")
                    .append(prepositions[random.nextInt(5)])
                    .append(" ")
                    .append(articles[random.nextInt(5)])
                    .append(" ")
                    .append(nouns[random.nextInt(5)])
                    .append(". ");
        }
        return stringBuilder.toString().trim();
    }
}
