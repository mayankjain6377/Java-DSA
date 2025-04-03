package java_Leetcode_Problems;

import java.util.Arrays;

public class java15_TwoSumSorted {
    public static void main(String[] args) {
        int[] nums={21,22,62};
        System.out.println(Arrays.toString( twoSum(nums,84)));

    }
    public static int[] twoSum(int[] nums, int target) {
        int left=1;
        int right=nums.length;
        while(left<right){
            int leftnum=nums[left-1];
            int rightnum=nums[right-1];
            int sum=leftnum+rightnum;
            if(sum==target){
                return new int[]{left,right};
            }
            if(sum>target){
                right--;
            }
            else {
                left++;
            }
        }
        return new int[]{-1,-1};
    }

}
