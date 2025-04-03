package java_Leetcode_Problems;

public class java44_CountNegativeNumber {
    public static void main(String[] args) {
        int[][] nums = {
                {4, 3, 2, -1},
                {3, 2, 1, -1},
                {1, 1, -1, -2},
                {-1, -1, -2, -3}
        };

        System.out.println(  countNegatives(nums));

    }
    public static int countNegatives(int[][] nums) {
        int count=0;
        int temp=0;

        for(int i=0;i<nums.length;i++)
        {
            // for(int j=0;j<grid[i].length;j++)
            // {
            //     if(grid[i][j]<0)
            //     {
            //         count++;
            //     }
            // }
            int left=0;
            int right=nums.length-1;
            while(left<right){
                int mid=left+(right-left)/2;
                if(nums[i][mid]>=0){
                    left=mid+1;

                }
                else{
                    right=mid-1;
                }

            }
            count=count+nums.length-left;
        }
        return count;
    }
}
