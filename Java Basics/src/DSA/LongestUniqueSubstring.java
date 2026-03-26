package DSA;
//Sliding Window — Longest Substring Without Repeating Characters

import java.util.*;

public class LongestUniqueSubstring {
    public static int lengthOfLongestSubstring(String s) {
        // Store character and its last seen index
        Map<Character, Integer> map = new HashMap<>();
        // Track maximum length found and left pointer of sliding window
        int maxLen = 0, left = 0;

        // Use right pointer to expand the window
        for (int right = 0; right < s.length(); right++) {
            // Get current character
            char c = s.charAt(right);
            // If character already exists, move left pointer to remove duplicate
            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1); // shrink window
            }
            // Store current character with its index
            map.put(c, right);
            // Update maximum length with current window size
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        // Test case 1: "abcabcbb" → longest unique substring is "abc" with length 3
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // 3 → "abc"
        // Test case 2: "pwwkew" → longest unique substring is "wke" with length 3
        System.out.println(lengthOfLongestSubstring("pwwkew"));   // 3 → "wke"
    }
}
