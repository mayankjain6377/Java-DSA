import java.util.ArrayList;
import java.util.Arrays;

public class java5_concat {
    public static void main(String[] args) {
        int []nums={1,12,3,4};
        int temp[]=new int [nums.length];
        int [] ans=new int [nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=nums[i];
            for(int j=0;j<i+1;j++)
            {
                temp[j]=nums[j]+nums[j+1];
                nums[i+1]=temp[j];
                
            }
        }
        System.out.println(Arrays.toString(ans));
       












//         int nums[]={1,2,1};
//     int[] nums2=new int[6];
//     System.out.println(Arrays.toString(nums));
//    for(int i=0;i<nums2.length;i++){
//         nums2[i]=nums[i];
//    }
//    for(int i=0;i<nums2.length;i++)
//    {
//     nums[i]=nums2[i];
//    }
// System.out.println(Arrays.toString(nums));
    








    }
}
