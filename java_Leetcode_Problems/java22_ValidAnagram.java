package java_Leetcode_Problems;

public class java22_ValidAnagram {
    public static void main(String[] args) {
String s="mayank";
String t="ankyam";
        System.out.println(isAnagram(s,t));

    }

        public static boolean isAnagram(String s, String t) {

            if(s.length()!=t.length()){
                return false;
            }
            int[] count=new int[26];
            for (int i = 0; i <s.length() ; i++) {
                char ch=s.charAt(i);
                count[ch-'a']++;
            }
            for (int i = 0; i < t.length(); i++) {
                char ch=t.charAt(i);
                count[ch-'a']--;
            }
            for(int i=0;i<count.length;i++){
                if(count[i]>0){
                    return false;
                }
            }
            return true;

        }


}
