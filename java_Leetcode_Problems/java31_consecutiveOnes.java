package java_Leetcode_Problems;

public class java31_consecutiveOnes {
    public static void main(String[] args) {
        System.out.println( findMaxConsecutiveOnes(new int[]{1,1,1,1,0,1}));

    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int curr=0,count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                curr++;
                count=Math.max(curr,count);
            }
            else{
                curr=0;
            }
        }
        return count;
    }
}
