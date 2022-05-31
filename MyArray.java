package lesson4;

import java.util.*;

public class MyArray {
        public static String[] getArray() {
        return new String[]{
                "юбка", "блуза", "брюки", "рубашка", "комбинезон", "куртка", "брюки", "жилет", "байка", "рубашка",
                "байка", "блуза", "шарф", "брюки", "рубашка", "туфли", "кепка", "юбка"
        };
        }

       public static void uniqueWords(String[] array) {
            Set<String> uniqueWords = new HashSet<>(Arrays.asList(array));
            System.out.println("Уникальные слова: " + uniqueWords);
        }

        public static void counterWords(String[] getCountArray){
            Map<String, Integer> counterWordArray = new HashMap<>();
            for (String word : getCountArray) {
                counterWordArray.put(word, counterWordArray.getOrDefault(word, 0) + 1);
            }
            System.out.println("Повторений слов: " + counterWordArray);

    }

}
