package java_Leetcode_Problems;

import java.util.Arrays;

public class java13_SingleNumber {
    public static void main(String[] args) {
singleNumber(new int[]{1,1,2,4,1,2,3,2,3});

    }
    public static int singleNumber(int []nums)
    {
        boolean[] temp=new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (!temp[i]) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        temp[j] = true;
                        temp[i]=true;
                    }
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (!temp[i]){
                System.out.println(nums[i]);
                return nums[i];
            }

        }
        System.out.println(Arrays.toString(temp));
        return 1;
    }
}
