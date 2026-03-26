package DSA;

public class LongestPalindrome {

    public static String longestPalindrome(String s){
        if(s == null || s.length() < 1) return "";

        int start = 0, maxLength = 1;

        for(int i = 0; i < s.length(); i++){
            int len1 = expandAroundCenter(s, i, i); // Odd length palindrome
            int len2 = expandAroundCenter(s, i, i + 1); // Even length palindrome
            int len = Math.max(len1, len2);
            if(len > maxLength){
                maxLength = len;
                start = i - (len - 1) / 2;
            }

        }
        return s.substring(start, start + maxLength);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1; // Length of the palindrome
    }

    public static void main(String[] args){
        String input = "babad";
        String output = longestPalindrome(input);
        System.out.println("Longest Palindrome: " + output);
        System.out.println(longestPalindrome("cbbd"));    // "bb"
        System.out.println(longestPalindrome("racecar")); // "racecar"
        System.out.println(longestPalindrome("abacaba")); // abacaba
    }
}
