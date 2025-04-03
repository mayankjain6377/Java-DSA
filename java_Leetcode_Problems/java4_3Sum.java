package java_Leetcode_Problems;

import java.util.*;

public class java4_3Sum {
    public static void main(String[] args) {

        int[] nums = {-1,0,1,2,-1,-4,-2,-3,3,0,4};
       List<List<Integer>> ans = threesum(nums);
        System.out.println(ans);
    }

    private static List<List<Integer>> threesum(int[] nums) {
if(nums.length<3){
    return new ArrayList<>();
}
        Arrays.sort(nums);
        List<List<Integer>> set = new ArrayList<>();


        for (int i = 0; i < nums.length - 2; i++) {
            int k = nums.length - 1;
            int j = i + 1;

            while (j < k) {
               int sum = nums[i] + nums[j] + nums[k];
                List<Integer> list = new ArrayList<>();
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    j++;
                    k--;
                    set.add(list);
                }
            }
        }
//        System.out.println(list);

        return new ArrayList<List<Integer>>(set);
    }
}
