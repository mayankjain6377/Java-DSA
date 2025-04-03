package java_Leetcode_Problems;

import java.util.Arrays;

public class java26_ReverseString {
    public static void main(String[] args) {
        char[]s = {'m','a','y'};
        int left=0;
        int right=s.length-1;
        while(left<=right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(s));
    }
}
