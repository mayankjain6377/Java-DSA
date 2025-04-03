package java_Leetcode_Problems;

import java.util.HashMap;
import java.util.Map;

public class java2_RomanToInteger_13 {
    public static void main(String[] args) {

        romanToInt("LI");
    }
    public static int romanToInt(String s) {
        Map<String, Integer> romanMap = new HashMap<>();
        romanMap.put("I",1);
        romanMap.put("V",5);
        romanMap.put("X",10);
        romanMap.put("L",50);
        romanMap.put("C",100);
        romanMap.put("D",500);
        romanMap.put("M",1000);
        int sum=1;
        for (int i = 0; i < s.length()-1; i++) {
            String str = Character.toString(s.charAt(i));
sum=sum+romanMap.get(str);
        }
        return sum;
    }
}
