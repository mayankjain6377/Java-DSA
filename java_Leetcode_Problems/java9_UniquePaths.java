package java_Leetcode_Problems;

public class java9_UniquePaths {
    public static void main(String[] args) {
        long starttime=System.nanoTime();
        System.out.println(uniquePaths(51, 9));
    long endtime=System.nanoTime();
        System.out.println(endtime-starttime);
    }

    public static int uniquePaths(int m, int n) {
        return helper(m, n);
    }
    private static int helper(int i, int j) {
        if (i == 1 || j == 1) {
            return 1;
        }
           int left= helper(i - 1, j);
           int right= helper(i, j - 1);
        return left+right;
    }
}
