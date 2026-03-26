package Java8Features;

import java.util.*;
import java.util.stream.*;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 2, 4, 3, 5, 1);

        // Method 1: Using frequency + filter
        Set<Integer> duplicates = nums.stream()
                .filter(n -> Collections.frequency(nums, n) > 1)
                .collect(Collectors.toSet());

        System.out.println("Duplicates: " + duplicates); // [1, 2, 3]

        // Method 2: Using Set seen trick (preserves order)
        Set<Integer> seen = new HashSet<>();
        List<Integer> dups = nums.stream()
                .filter(n -> !seen.add(n))   // add() returns false if already present
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Ordered duplicates: " + dups); // [2, 3, 1]
    }
}