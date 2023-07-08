package doSelect;

import java.util.HashMap;
import java.util.Map;

public class Source {
    public static Map<Character, Integer> countChars(char[] arr) {
        Map<Character, Integer> charCount = new HashMap<>();
        
        for (char c : arr) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        return charCount;
    }

    public static void main(String[] args) {
        char[] arr = {'a', 'f', 'c', 'd', 'a', 'c'};
        Map<Character, Integer> result = countChars(arr);
        System.out.println(result);
    }
}
