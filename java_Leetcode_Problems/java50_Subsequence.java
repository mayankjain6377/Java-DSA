package java_Leetcode_Problems;

public class java50_Subsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("b","abc"));

    }
    public static boolean isSubsequence(String s, String y) {
        int i=0,t=0;
        while(t<y.length()){
            if(s.charAt(i)==y.charAt(t)){
                i++;
            }
            t++;

        }
        return i==s.length();
    }
}
