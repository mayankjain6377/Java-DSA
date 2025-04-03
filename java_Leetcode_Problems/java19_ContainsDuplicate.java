package java_Leetcode_Problems;

import java.util.HashSet;
import java.util.Set;

public class java19_ContainsDuplicate {
    public static void main(String[] args) {

        int[] nums={1,2,6,5,31};
        System.out.println( duplicate(nums));

    }
    public static boolean duplicate(int []nums){
        Set<Integer>set=new HashSet<>();
        for (int i = 0; i < nums.length-1; i++) {
            if(!set.contains(nums[i])){
                set.add(nums[i]);

            }
            else {
                return true;
            }

        }


        return false;
    }
}
