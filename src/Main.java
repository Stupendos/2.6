import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
        for (int num : nums) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
        for (int num : nums) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
        }
        List<String> words = Arrays.asList("дом", "дерево", "зарплата", "апельсин", "дом", "фрукт", "груша", "фрукт");
        Set<String> uniqueWords = new HashSet<>(words);
        for (String word : uniqueWords) {
            System.out.println(word);
        }
        List<String> strings = new ArrayList<>(List.of("один", "два", "три", "один", "два", "три", "три", "четыре", "четыре", "четыре","четыре"));
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : strings) {
            word = word.trim().toLowerCase();
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        System.out.println("Количество дублей для каждого уникального слова:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}