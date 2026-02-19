package Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Java8ArrayExamples {
    public static void main(String[] args) {
        System.out.println("=== Java 8 Array Examples ===\n");

        // Example 1: Using Stream API to filter and print array elements
        System.out.println("Example 1: Filter array elements > 5");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.stream(numbers)
                .filter(n -> n > 5)
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        // Example 2: Map array elements (multiply by 2)
        System.out.println("Example 2: Multiply each element by 2");
        Arrays.stream(numbers)
                .map(n -> n * 2)
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        // Example 3: Sum all elements in array
        System.out.println("Example 3: Sum of all elements");
        int sum = Arrays.stream(numbers)
                .sum();
        System.out.println("Sum: " + sum);
        System.out.println();

        // Example 4: Find average of array elements
        System.out.println("Example 4: Average of array elements");
        double average = Arrays.stream(numbers)
                .average()
                .orElse(0.0);
        System.out.println("Average: " + average);
        System.out.println();

        // Example 5: Find max and min using Optional
        System.out.println("Example 5: Max and Min values");
        int max = Arrays.stream(numbers)
                .max()
                .orElse(0);
        int min = Arrays.stream(numbers)
                .min()
                .orElse(0);
        System.out.println("Max: " + max + ", Min: " + min);
        System.out.println();

        // Example 6: Count elements matching a condition
        System.out.println("Example 6: Count elements > 5");
        long count = Arrays.stream(numbers)
                .filter(n -> n > 5)
                .count();
        System.out.println("Count: " + count);
        System.out.println();

        // Example 7: Check if all elements match a condition (allMatch)
        System.out.println("Example 7: Check if all elements are positive");
        boolean allPositive = Arrays.stream(numbers)
                .allMatch(n -> n > 0);
        System.out.println("All positive: " + allPositive);
        System.out.println();

        // Example 8: Check if any element matches a condition (anyMatch)
        System.out.println("Example 8: Check if any element is > 8");
        boolean anyGreaterThan8 = Arrays.stream(numbers)
                .anyMatch(n -> n > 8);
        System.out.println("Any > 8: " + anyGreaterThan8);
        System.out.println();

        // Example 9: Create array using IntStream.range()
        System.out.println("Example 9: Create array using IntStream.range()");
        int[] rangeArray = IntStream.range(1, 6)
                .toArray();
        System.out.println("Range array: " + Arrays.toString(rangeArray));
        System.out.println();

        // Example 10: Create array using IntStream.rangeClosed()
        System.out.println("Example 10: Create array using IntStream.rangeClosed()");
        int[] rangeClosedArray = IntStream.rangeClosed(1, 5)
                .toArray();
        System.out.println("Range closed array: " + Arrays.toString(rangeClosedArray));
        System.out.println();

        // Example 11: Convert array to stream, filter, and collect to new array
        System.out.println("Example 11: Filter and create new array (even numbers)");
        int[] evenNumbers = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .toArray();
        System.out.println("Even numbers: " + Arrays.toString(evenNumbers));
        System.out.println();

        // Example 12: Use peek() for debugging - see intermediate values
        System.out.println("Example 12: Using peek() to debug stream");
        Arrays.stream(numbers)
                .filter(n -> n > 3)
                .peek(n -> System.out.print("After filter: " + n + " "))
                .map(n -> n * 2)
                .peek(n -> System.out.print("After map: " + n + " | "))
                .forEach(n -> {});
        System.out.println("\n");

        // Example 13: Using distinct() to remove duplicates
        System.out.println("Example 13: Remove duplicate elements");
        int[] withDuplicates = {1, 2, 2, 3, 3, 3, 4, 5, 5};
        int[] noDuplicates = Arrays.stream(withDuplicates)
                .distinct()
                .toArray();
        System.out.println("Original: " + Arrays.toString(withDuplicates));
        System.out.println("Without duplicates: " + Arrays.toString(noDuplicates));
        System.out.println();

        // Example 14: Chaining multiple operations
        System.out.println("Example 14: Complex chain - filter, map, and count");
        long complexResult = Arrays.stream(numbers)
                .filter(n -> n > 3)
                .map(n -> n * n)
                .filter(n -> n < 50)
                .count();
        System.out.println("Count of squares < 50 (from numbers > 3): " + complexResult);
        System.out.println();

        // Example 15: Using sorted() to sort stream
        System.out.println("Example 15: Sort and print in reverse order");
        int[] unsorted = {5, 2, 8, 1, 9, 3};
        Arrays.stream(unsorted)
                .sorted()
                .forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}

