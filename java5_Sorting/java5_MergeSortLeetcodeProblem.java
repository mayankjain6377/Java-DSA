package java5_Sorting;

import java.util.Arrays;

public class java5_MergeSortLeetcodeProblem {
    public static void main(String[] args) {
        int m = 5;
        int n = 2;
        int[] nums1 = {1, 2,2,2, 3, 0, 0};
        int[] nums2 = {2, 6};
        for (int i = 0; i < nums2.length; i++) {
            nums1[m + i] = nums2[i];
        }
        for (int i = 0; i < nums1.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(nums1[j]<nums1[j-1])
                {
                    int temp=nums1[j];
                    nums1[j]=nums1[j-1];
                    nums1[j-1]=temp;
                }
else break;
            }
        }
        System.out.println(nums1[(nums1.length/2)+1]);
        System.out.println(Arrays.toString(nums1));
    }
}
