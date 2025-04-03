package java_Leetcode_Problems;

import java.util.Arrays;
import java.util.Objects;

public class java14_ReverseWords {
    public static void main(String[] args) {
     reverseWords("a good   example");

    }
    //s="the sky is blue"
    //output "blue is sky the"
    public static String reverseWords(String s) {

        String[] words=s.trim().split("\\s+");
        StringBuilder res=new StringBuilder();
        for (int i = words.length-1; i >=0 ; i--) {
            res.append(words[i]);
            if(i!=0){
               res.append(" ");
            }
        }

//        System.out.println(res.toString());
//        System.out.println(Arrays.toString(words));
return res.toString();
    }
}
