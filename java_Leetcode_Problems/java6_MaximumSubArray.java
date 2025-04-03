package java_Leetcode_Problems;

public class java6_MaximumSubArray {
    public static void main(String[] args) {
int[] nums={-2,1,-3,4,-1,2,1,-5,4};
int ans=maxSubArray(nums);
        System.out.println(ans);
    }
    public static int maxSubArray(int []nums){
        int sum=0;
        int curr=nums[0];
        for (int i = 0; i< nums.length ; i++) {
            sum=sum+nums[i];
            curr=Math.max(curr,sum);
          if(sum<0)
          {
              sum=0;
          }
        }
        return curr;
    }
}
