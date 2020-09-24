
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

    /**
     *  @autor Динар Мирсаитов
     * @version 1.0
     */

    public class Homework6 {
        public static void main(String[] args) {
            Scanner fileScanner;
            try {
                fileScanner = new Scanner(new File("src\\main\\java\\text.txt"));
            } catch (FileNotFoundException e) {
                System.out.println("Файл не найден!");
                return;
            }

            Map<String, Integer> words = new TreeMap<>();
            int max = 0;
            String maxWord = null;
            while (fileScanner.hasNext()) {
                String word = fileScanner.next();
                int counter = words.getOrDefault(word, 0);
                counter++;
                if (counter > max) {
                    max = counter;
                    maxWord = word;
                }
                words.put(word, counter);
            }

            System.out.println("Сортировка в алфавитном порядке: " + words.keySet());

            System.out.println("Статистика по использованию слов:");
            for (Map.Entry<String, Integer> entry : words.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }

            System.out.println("Максимальное количество повторений: " + maxWord + " (" + max + " повтора)");
        }
    }

