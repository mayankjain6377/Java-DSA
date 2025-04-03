package java_Leetcode_Problems;

public class java12_BuyOrSellStock {
    public static void main(String[] args) {
        maxProfit(new int[]{7, 1, 3, 4, 8});
    }
        public static int maxProfit ( int[] nums){
            int maxProfit = 0;
            int profit = 0;
            int currmin = nums[0];
            // int i=1;
            for (int i = 1; i < nums.length; i++) {
                currmin = Math.min(nums[i], currmin);
                profit = nums[i] - currmin;
                maxProfit = Math.max(maxProfit, profit);
            }
            System.out.println(maxProfit);
            return maxProfit;
        }
    }

