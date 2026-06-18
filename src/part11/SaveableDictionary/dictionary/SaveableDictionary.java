package part11.SaveableDictionary.dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class SaveableDictionary {
    private HashMap<String, String> dictionary = new HashMap<>();
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.file = file;
    }

    public void add(String words, String translations) {
        dictionary.putIfAbsent(words, translations);
        dictionary.putIfAbsent(translations, words);
    }

    public String translate(String word) {
        return dictionary.get(word);
    }

    public void delete(String word) {
        String translation = dictionary.get(word);
        dictionary.remove(word);
        dictionary.remove(translation);
    }

    public boolean load() {
        try {
            Scanner fileReader = new Scanner(new java.io.File(file));

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");   // split the line based on the ':' character

                dictionary.putIfAbsent(parts[0], parts[1]);
                dictionary.putIfAbsent(parts[1], parts[0]);
            }
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(file);

            for (String key : dictionary.keySet()) {
                String value = dictionary.get(key);

                if (dictionary.containsKey(value) && dictionary.get(value).equals(key) && value.compareTo(key) < 0) {
                    continue;
                }

                writer.println(key + ":" + value);
            }

            writer.close();
            return true;

        } catch (Exception e) {
            return false;
        }
    }
}