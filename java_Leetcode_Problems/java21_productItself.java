package java_Leetcode_Problems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class java21_productItself {
    public static void main(String[] args) {
int[]nums={1,2,3,4};
        productExceptSelf(nums);

    }
    public static void productExceptSelf(int[] nums) {
        int[] result=new int[nums.length];
        for(int i=0,temp=1;i<nums.length;i++){
            result[i]=temp;
            temp=temp*nums[i];
        }
        for(int i=nums.length-1,temp=1;i>=0;i--){
            result[i]=result[i]*temp;
            temp=temp*nums[i];

        }
        System.out.println(Arrays.toString(result));
    }
}
