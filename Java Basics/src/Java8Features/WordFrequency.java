package Java8Features;

/* Count word frequency using streams
```
**Output:**
```
java  → 3
great → 2
is    → 1
streams → 1
are   → 1
 */

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class WordFrequency {
    public static void main(String[] args) {
        String sentence = "java is great java streams are great java";

        // Word frequency map sorted by count DESC
        Map<String, Long> freq = Arrays.stream(sentence.split(" "))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        System.out.println("Word frequencies:");
        freq.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEach(e -> System.out.println(e.getKey() + " → " + e.getValue()));
    }
}

