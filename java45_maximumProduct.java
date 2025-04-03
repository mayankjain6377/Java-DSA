import java.util.Arrays;

public class java45_maximumProduct {
    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{1,4,5,2,6,7}));

    }
    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int last=nums[n-1]-1;
        int second=nums[n-2]-1;
        int ans=last*second;
        return ans;
    }
}
