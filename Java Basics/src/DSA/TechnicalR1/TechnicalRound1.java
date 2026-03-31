package DSA.TechnicalR1;

import java.util.*;

public class TechnicalRound1 { // Main class
    public int[] forecastAnalysis(int[] temperatureReadings) {
        // Method to analyze temperature readings
        int n = temperatureReadings.length; // Get the length of the input array
        int[] result = new int[n]; // Initialize result array with zeros
        Stack<Integer> stack = new Stack<>(); // Stack to keep indices

        for (int i = 0; i < n; i++) { // Loop through each temperature
            // While stack is not empty and current temperature is greater than temperature at stack's top index
            while (!stack.isEmpty() && temperatureReadings[i] > temperatureReadings[stack.peek()]) {
                int idx = stack.pop(); // Pop the index from the stack
                result[idx] = i - idx; // Set the result as the difference in indices
            }
            stack.push(i); // Push current index onto the stack
        }
        return result; // Return the result array
    }

    public static void main(String[] args) { // Main method for testing
        TechnicalRound1 analyzer = new TechnicalRound1(); // Create an instance of Main

        // Test Case 1
        int[] input1 = {65, 66, 70, 64, 63, 65, 75, 68}; // Input temperatures
        int[] expected1 = {1, 1, 4, 1, 1, 1, 0, 0}; // Expected output
        System.out.println(Arrays.equals(analyzer.forecastAnalysis(input1), expected1)); // Print test result

        // Test Case 2
        int[] input2 = {80, 79, 70, 73, 77, 75}; // Input temperatures
        int[] expected2 = {0, 0, 1, 1, 0, 0}; // Expected output
        System.out.println(Arrays.equals(analyzer.forecastAnalysis(input2), expected2)); // Print test result

        // Test Case 3
        int[] input3 = {60, 65, 62, 70, 80, 85}; // Input temperatures
        int[] expected3 = {1, 2, 1, 1, 1, 0}; // Expected output
        System.out.println(Arrays.equals(analyzer.forecastAnalysis(input3), expected3)); // Print test result

        // Test Case 4
        int[] input4 = {90, 80, 70, 60, 50, 60, 70, 80, 90}; // Input temperatures
        int[] expected4 = {0, 5, 4, 3, 1, 1, 1, 1, 0}; // Expected output
        System.out.println(Arrays.equals(analyzer.forecastAnalysis(input4), expected4)); // Print test result
    }
}