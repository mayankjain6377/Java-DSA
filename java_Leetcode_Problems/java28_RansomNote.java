package java_Leetcode_Problems;

import java.util.HashMap;
import java.util.Map;

public class java28_RansomNote {
    public static void main(String[] args) {
        System.out.println(canConstruct("ahset","aashses"));

    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else {
                map.put(ch, 1);
            }

        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char rch=ransomNote.charAt(i);
            if (!map.containsKey(rch) || map.get(rch) <= 0) {
                return false;
            }
            map.put(rch, map.get(rch) - 1);
        }
        System.out.println(map);
        return true;
    }
}
