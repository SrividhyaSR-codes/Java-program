package DSA.QualifierRound;

import java.util.*;
import java.util.stream.Collectors;

public class ValidInteger {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("as", "123", "32", "2as");
        List<Integer> result = filterValidIntegers(input);
        System.out.println(result);
    }

    public static List<Integer> filterValidIntegers(List<String> strings) {
        return strings.stream()
                .filter(s -> s.matches("-?\\d+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
