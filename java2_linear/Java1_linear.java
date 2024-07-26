// package java2;
package java2_linear;


public class Java1_linear {
    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 6, 7, 8};
        int target = 0;
        String ans = linearSearch(nums, target);
        System.out.println(ans);

    }

    static public String linearSearch(int[] nums, int target) {
        if (nums.length == 0) {
            return "0 length String not possible";
        }
        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            if (element == target) {
                return "item found ";
            }


        }
        return "item not found";
    }
}



