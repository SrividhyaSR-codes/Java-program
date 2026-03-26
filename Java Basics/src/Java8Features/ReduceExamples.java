package Java8Features;

public class ReduceExamples {

        public static void main(String[] args) {
            // Example 1: Sum of numbers
            int sum = java.util.stream.IntStream.of(1, 2, 3, 4, 5)
                    .reduce(0, Integer::sum);
            System.out.println("Sum: " + sum); // 15

            // Example 2: Product of numbers
            int product = java.util.stream.IntStream.of(1, 2, 3, 4)
                    .reduce(1, (a, b) -> a * b);
            System.out.println("Product: " + product); // 24

            // Example 3: Find max
            int max = java.util.stream.IntStream.of(5, 3, 8, 2)
                    .reduce(Integer.MIN_VALUE, Integer::max);
            System.out.println("Max: " + max); // 8

            // Example 4: Concatenate strings
            String concatenated = java.util.stream.Stream.of("Hello", " ", "World")
                    .reduce("", String::concat);
            System.out.println("Concatenated: " + concatenated); // Hello World
        }
}
