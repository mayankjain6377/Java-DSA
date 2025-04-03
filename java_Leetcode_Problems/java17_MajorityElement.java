package java_Leetcode_Problems;

public class java17_MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));

    }
    public static int majorityElement(int[] nums) {
        int count = 0;       // Tracks occurrences of candidate
        int candidate = 0;   // Stores the potential majority element

        for (int num : nums) {  // Iterate through the array
            if (count == 0) {   // If count is zero, select a new candidate
                candidate = num;
            }
            if (num == candidate) {
                count++;    // Increase count if it's the same as candidate
            } else {
                count--;    // Decrease count if it's a different number
            }
        }
        return candidate;   // Return the majority element
    }

}

