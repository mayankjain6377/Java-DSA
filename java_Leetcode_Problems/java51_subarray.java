package java_Leetcode_Problems;

public class java51_subarray {
    public static void main(String[] args) {
int[] nums={2,3,1,2,4,3};
        System.out.println(subarray(nums,7));
    }

    private static int subarray(int[] nums,int target) {
        int j=0;
        int ans=Integer.MAX_VALUE;
        int n=nums.length;
        for (int i = 0; i < n-1; i++) {
            int sum=0;
            int digit=0;
            while(sum<target){
                sum+=nums[j];
                j++;
                digit++;

            }

            ans = Math.min(ans, digit);
            if (i<nums.length-2) {
                j=i+1;
            }
            if(j== nums.length){
    j=0;
}
        }
        return ans;
    }
}
