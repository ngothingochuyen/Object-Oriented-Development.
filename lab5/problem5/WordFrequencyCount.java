package lab5.problem5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordFrequencyCount {

    private Map<String, Integer> words = new TreeMap<>();

    public void readFile(String fileName) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(fileName));

        while (sc.hasNext()) {
            String word = sc.next();
            words.put(word, words.getOrDefault(word, 0) + 1);
        }

        sc.close();
    }

    public void output() {
        System.out.println("\nWord                Count");
        System.out.println("-------------------------");

        for (String word : words.keySet()) {
            System.out.printf("%-20s %d%n", word, words.get(word));
        }
    }
}
