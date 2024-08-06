package java2_linear;

public class java4_SearchInRange {
    public static void main(String[] args ){
        int [] nums={5,1,7,3,8,-3};
        int target=8;
        int min=nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]<min) {
                min = nums[i];
            }
            }
        System.out.println(min);
    }
    }

