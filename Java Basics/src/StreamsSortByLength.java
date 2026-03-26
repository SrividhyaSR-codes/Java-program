import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamsSortByLength {
    public static void main(String[] args) {
        String input = "Srividhya S R";
        
        String output = Arrays.stream(input.split(" "))
                             .sorted((a, b) -> Integer.compare(a.length(), b.length()))
                             .collect(Collectors.joining(" "));
        
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}

