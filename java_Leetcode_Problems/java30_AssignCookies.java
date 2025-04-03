package java_Leetcode_Problems;

import java.util.Arrays;

public class java30_AssignCookies {
    public static void main(String[] args) {
        System.out.println(findContentChildren(new int[]{1,2,3},new int[]{1,2}));

    }
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int child = 0, cookie = 0;

        for (; child < g.length && cookie < s.length; cookie++) {
            if (s[cookie] >= g[child]) {
                child++;
            }
        }

        return child;
    }
}
