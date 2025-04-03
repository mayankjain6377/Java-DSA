package java_Leetcode_Problems;

import java.util.Arrays;

public class java18_RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        RotateArray(nums, k);
    }

    public static void RotateArray(int[] nums, int k) {
      swap(nums,0, nums.length-1);
        System.out.println(Arrays.toString(nums));
        swap(nums,0,k-1);
        System.out.println(Arrays.toString(nums));
      swap(nums,k, nums.length-1);
        System.out.println(Arrays.toString(nums));

    }
    public static void swap(int[] nums, int left, int right){
        while (left <= right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
