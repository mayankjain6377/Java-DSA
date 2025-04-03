package java_Leetcode_Problems;

public class java7_JumpGame {
    public static void main(String[] args) {
        int[]nums={2,3,1,1,4};
//        int[]nums={3,2,1,0,4};
        System.out.println( canJump(nums));

    }

    public static boolean canJump(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int goal=nums.length-1;
        int maxReach=nums[0];
        for (int i=1;maxReach>=i;i++){
            if(maxReach>=goal){
                return true;

            }
            else{
                maxReach=Math.max(maxReach,nums[i]+i);
            }
        }
        return false;
    }
}
