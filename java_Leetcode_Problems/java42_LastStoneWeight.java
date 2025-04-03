package java_Leetcode_Problems;

import java.util.Arrays;

public class java42_LastStoneWeight {
    public static void main(String[] args) {
int[]nums={2,7,12,1,8,1};
        System.out.println(lastStoneWeight(nums));


    }

    public  static int lastStoneWeight(int[] stones) {
        int n = stones.length;
        while (n > 1) {
            Arrays.sort(stones, 0, n);
            int x = stones[n - 1];
            int y = stones[n - 2];
            if (x == y) {
                n -= 2;
            } else {
                stones[n - 2] = x - y;
                n--;
            }
        }
        return n == 0 ? 0 : stones[0];
    }
}
