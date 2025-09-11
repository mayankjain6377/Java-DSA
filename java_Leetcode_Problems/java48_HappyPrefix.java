package java_Leetcode_Problems;

import java.util.Arrays;

public class java48_HappyPrefix {
    public static void main(String[] args) {
String str="level";
        System.out.println(happy(str));

    }

    public static String happy(String str){
        int n=str.length();
        String[] prefix=new String[n-1];
        String[] suffix=new String[n-1];

        prefix[0]=Character.toString(str.charAt(0));
        for(int i=1;i<str.length()-1;i++){
            prefix[i]=prefix[i-1]+Character.toString(str.charAt(i));
        }

        suffix[0]=Character.toString(str.charAt(n-1));
        for(int i=n-1;i>0;i--){
            suffix[(n-1)-i]=Character.toString(str.charAt(i))+suffix[(n-1)-i-1];
        }

        System.out.println(Arrays.toString(prefix));
        System.out.println("suffix array");
        System.out.println(Arrays.toString(suffix));



        return "";
    }
}
