package java2_linear;

import java.util.Arrays;

public class java5_smaller {
    public static void main(String[] args )
    {
        int [] nums={8,1,2,2,3};
        int sum=0;
        int[] temp =new int [nums.length];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]>nums[j])
                {
                    sum++;
                }
            }
            for(int j=0;j<nums.length;j++)
            {
                temp[i]=sum;

            }
//            System.out.println(sum);
            sum=0;
        }
        System.out.println(Arrays.toString(temp));
    }

}
