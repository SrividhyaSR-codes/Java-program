import java.util.Comparator;
import java.util.stream.Collectors;

public class Streams1 {
public static String getReverseString(String input){
    return input.chars().mapToObj(c->(char)c).
            distinct().sorted(Comparator.reverseOrder()).
            map(String::valueOf).
            collect(Collectors.joining());
}

    public static void main(String[] args){

    String input = "aaaabbbcccccdddd";
    String output = getReverseString(input);
    System.out.println("Output of the string : "+output);
    }
}