package Java8Features;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String str = "swiss";

        // LinkedHashMap preserves insertion order
        Optional<Character> result = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        System.out.println("First non-repeating: " + result.orElse(null)); // w
    }
}