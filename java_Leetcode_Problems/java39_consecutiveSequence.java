package java_Leetcode_Problems;

import java.util.Arrays;

public class java39_consecutiveSequence {
    public static void main(String[] args) {
        System.out.println( longestConsecutive(new int[]{100,4,2,3,1,200}));

    }
    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        int curr=0;
        int last=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1==last){
                curr+=1;
                last=nums[i];
            } else if (nums[i]!=last) {
                curr=1;
                last=nums[i];
            }
            count=Math.max(curr,count);

        }
        return count;
    }
}
