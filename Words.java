package Homework4;

import java.util.HashMap;

public class Words {
    public static void main(String[] args) {
        String[] words = {"strawberry", "celery", "banana", "pear", "carrot",
                "pepper", "avocado", "lemon", "radish", "peach", "strawberry",
                "pear", "avocado", "pepper", "strawberry", "pear", "pear"};

        HashMap<String, Integer> uniqueWords = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            if (uniqueWords.containsKey(words[i])) {
                uniqueWords.put(words[i], uniqueWords.get(words[i]) + 1);
            } else {
                uniqueWords.put(words[i], 1);
            }
        }

        System.out.println(uniqueWords);
    }
}
