import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void countWordFrequency(String sentence) {
        System.out.println("Input Sentence: \"" + sentence + "\"");

        if (sentence == null || sentence.trim().isEmpty()) {
            System.out.println("Warning: Sentence is empty! No words to process.\n");
            return;
        }

        String[] words = sentence.trim().split("\\s+");
        HashMap<String, Integer> freqMap = new HashMap<>();

        for (String w : words) {
            String word = w.toLowerCase();
            if (freqMap.containsKey(word)) {
                freqMap.put(word, freqMap.get(word) + 1);
            } else {
                freqMap.put(word, 1);
            }
        }

        System.out.println("Word Frequencies: " + freqMap);

        String mostFrequent = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        System.out.println("Most Frequently Occurring Word: \"" + mostFrequent + "\" (appeared " + maxCount + " times)\n");
    }

    public static void main(String[] args) {
        String input = "java is easy and java is powerful";
        countWordFrequency(input);

        countWordFrequency("");
    }
}
