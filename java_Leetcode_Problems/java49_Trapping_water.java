package java_Leetcode_Problems;

import java.util.Arrays;

public class java49_Trapping_water {
    public static void main(String[] args) {
        int[] nums={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(  trap(nums));
    }
    private static int trap(int[] nums) {
        int water=0;
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        int maxLeft=nums[0];
        int maxRight=nums[nums.length-1];
        for (int i = 0; i < left.length; i++) {
            maxLeft=Math.max(nums[i],maxLeft);
            left[i]=maxLeft;
        }
        for (int i = nums.length-1; i >= 0; i--) {
            maxRight=Math.max(nums[i],maxRight);
            right[i]=maxRight;
        }
        for (int i = 0; i < nums.length; i++) {
//           int DiffMin=Math.min(left[i],right[i]);
            water=water+ Math.min(left[i],right[i])-nums[i];
//           water=water+Curr;
        }
        return water;
    }
}
