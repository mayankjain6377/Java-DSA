//package java12_RecursionString;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class java5_permutation {
//    public static void main(String[] args) {
//        int[] nums = {1, 1,2};
//        List<List<Integer>> ans = permutation(nums);
//        System.out.println(ans);
//    }
//
//    static List<List<Integer>> result = new ArrayList<>();
//
//    private static List<List<Integer>> permutation(int[] nums) {
//        findpermutatation(nums, result, new ArrayList<>());
//        return result;
//    }
//
//    private static void findpermutatation(int[] nums, List<List<Integer>> result, List<Integer> sublist) {
//        if (sublist.size() == nums.length) {
//            result.add(new ArrayList<>(sublist));
//            return;
//        }
//        for (int number : nums) {
////            if (sublist.contains(number)) {
////                continue;
//
//
//            sublist.add(number);
//            findpermutatation(nums, result, sublist);
////            findpermutatation(nums, result, sublist);
//            sublist.remove(sublist.size() - 1);
//
//        }
//    }
//}
//
package java12_RecursionString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class java5_permutation {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        List<List<Integer>> ans = permutation(nums);
        System.out.println(ans);
    }

    static List<List<Integer>> result = new ArrayList<>();

    private static List<List<Integer>> permutation(int[] nums) {
        result.clear(); // Clear results for multiple runs
        Arrays.sort(nums); // Sort the array to handle duplicates
        boolean[] used = new boolean[nums.length]; // Track usage of elements
        findPermutation(nums, result, new ArrayList<>(), used);
        return result;
    }

    private static void findPermutation(int[] nums, List<List<Integer>> result, List<Integer> sublist, boolean[] used) {
        if (sublist.size() == nums.length) {
            result.add(new ArrayList<>(sublist));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            // Skip if the current number is already used or if it's a duplicate and hasn't been used in the same recursion level
            if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) {
                continue;
            }

            used[i] = true; // Mark as used
            sublist.add(nums[i]); // Add to current permutation
            findPermutation(nums, result, sublist, used);
            sublist.remove(sublist.size() - 1); // Backtrack
            used[i] = false; // Unmark as used
        }
    }
}
