package Java8Features;
// Predicate chaining — combine multiple conditions => and/or/negate

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;

public class PredicateChaining {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 20);

        Predicate<Integer> isEven     = n -> n % 2 == 0;
        Predicate<Integer> greaterTen = n -> n > 10;
        Predicate<Integer> isOdd      = isEven.negate();

        // Even AND greater than 10
        List<Integer> evenAndBig = nums.stream()
                .filter(isEven.and(greaterTen))
                .toList();
        System.out.println("Even & > 10 : " + evenAndBig); // [20]

        // Odd OR greater than 10
        List<Integer> oddOrBig = nums.stream()
                .filter(isOdd.or(greaterTen)).toList();
               // .collect(Collectors.toList());
        System.out.println("Odd | > 10  : " + oddOrBig); // [1,3,5,7,9,15,20]
    }
}
