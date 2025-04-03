package java_Leetcode_Problems;

import java.util.Arrays;

public class java11_SortColors {
    public static void main(String[] args) {
sortColors(new int[]{0,2,1,0,1,2,0});
    }
    public static void sortColors(int[] nums) {
        int left=0;
        int i=0;
        int right=nums.length-1;
        while(i<=right){
            if(nums[i]==0){
                swap(nums,i,left);
                i++;
                left++;
            }
            else if(nums[i]==2){
                swap(nums,i,right);
                right--;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void swap(int[]nums,int x,int y){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
}
