package Java8Features;

/*
## Outputs Summary

FindDuplicates      → [1, 2, 3]  |  ordered: [2, 3, 1]
FirstNonRepeating   → w
WordFrequency       → java=3, great=2, is=1 ...
FlatMap sum         → 45
Optional city       → Coimbatore / City not found
Predicate even>10   → [20]
Reduce product      → 120
 */

import java.util.*;
import java.util.stream.*;

public class ReduceExamples2 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        // Sum
        int sum = nums.stream().reduce(0, Integer::sum);
        System.out.println("Sum     : " + sum);     // 15

        // Product
        int product = nums.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Product : " + product); // 120

        // Max
        Optional<Integer> max = nums.stream().reduce(Integer::max);
        System.out.println("Max     : " + max.get()); // 5

        // Concat strings with reduce
        List<String> words = Arrays.asList("Java", "8", "Streams");
        String sentence = words.stream().reduce("", (a, b) -> a + " " + b).trim();
        System.out.println("Sentence: " + sentence); // Java 8 Streams
    }
}

