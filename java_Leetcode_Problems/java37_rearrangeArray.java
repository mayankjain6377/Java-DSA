package java_Leetcode_Problems;

import java.util.Arrays;

public class java37_rearrangeArray {
    public static void main(String[] args) {
        rearrangeArray(new int[]{3,1,-2,-5,2,-4});

    }
    public static void rearrangeArray(int[] nums) {
        int []pos=new int[nums.length/2];
        int j=0,k=0;
        int []neg=new int[nums.length/2];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos[j]=nums[i];
                j++;
            }
            else{
                neg[k]=nums[i];
                k++;
            }
        }
        j=0;
        k=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=pos[j];
                j++;
            }
            else{
                nums[i]=neg[k];
                k++;
            }
        }
        System.out.println(Arrays.toString(pos));
        System.out.println(Arrays.toString(neg));
        System.out.println(Arrays.toString(nums));


    }
}
