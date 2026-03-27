package DSA.QualifierRound;
import java.util.Arrays;

public class ReverseCharacterArray {
    public static void main(String[] args) { // Main method
        char[] s = { 'h', 'e', 'l', 'l', 'o' }; // Example input
        char[] o = reverseString(s); // Call reverseString
        System.out.println(Arrays.toString(o));
    }
    public static char[] reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        return s;
    }
}
