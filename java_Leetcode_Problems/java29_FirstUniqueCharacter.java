package java_Leetcode_Problems;

import java.util.Arrays;

public class java29_FirstUniqueCharacter {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));

    }

    public static int firstUniqChar(String s) {
        int[] count = new int[26];
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
