package java_Leetcode_Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class java23_MoveZeros {
    public static void main(String[] args) {
        System.out.println(word("abbba", "my nam name nam my"));
    }

    public static boolean word(String pattern, String word) {
        String[] strs = word.split(" ");
        if (strs.length != pattern.length()) {
            return false;
        }

        HashMap<Character, String> map = new HashMap<>();
        char[] chars = pattern.toCharArray();
        int j = 0;
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            String str = strs[j];
            if (map.containsKey(ch) && !map.get(ch).equals(str)) {
                return false;
            }
            if (!map.containsKey(ch) && map.containsValue(str)) {
                return false;
            }

            map.put(ch, str);
            j++;
        }


        System.out.println(map);
        return true;

    }
}
