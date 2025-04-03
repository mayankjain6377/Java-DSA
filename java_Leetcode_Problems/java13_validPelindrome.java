package java_Leetcode_Problems;

import java.util.Arrays;

public class java13_validPelindrome {
    public static void main(String[] args) {
        isPalindrome("A man, a plan, a canal: Panama");

    }

        public static boolean isPalindrome(String s) {
            s = s.toLowerCase();
            int left = 0;
            int right = s.length() - 1;

            while (left <= right) {
                while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                    left++;
                }
                while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                    right--;
                }

                if (s.charAt(left) != s.charAt(right)) {
                    return false;
                }

                left++;
                right--;
            }
            return true;
        }

}
