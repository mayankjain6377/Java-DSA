package java_Leetcode_Problems;

public class java46_GetWinner {
    public static void main(String[] args) {
        System.out.println( getWinner(new int[]{2,1,3,5,4,6,7},2));

    }
    public static int getWinner(int[] nums, int k) {
return helper(nums,k,0,Math.max(nums[0],nums[1]));
    }
    public static int helper(int[]nums, int k,int wincounts,int winner){
        if(wincounts==k){
            return nums[0];
        }
        if(nums[0]<nums[1]){
            int temp=nums[0];
            nums[0]=nums[1];
            nums[1]=temp;
        }
        int temp=nums[1];
        int n= nums.length;
        for (int i = 2; i < n-1; i++) {
            nums[i-1]=nums[i];

        }
        nums[n-1]=temp;
        if(winner==nums[0]){
            wincounts++;
        }
        winner=nums[0];
        return helper(nums,k,wincounts,winner);





//        return 0;
    }
}
