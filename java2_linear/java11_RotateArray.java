package java2_linear;
import java.util.Arrays;
public class java11_RotateArray {
    public static void main(String[] args) {
        int []nums={1,2,3,4,5,6,7,8};
        int k=3;
        int [] arr=new int[nums.length];
        for(int i=0; i<k; i++) {
            arr[(k-1)-i]=nums[(nums.length-1)-i];
        }
        for(int i=0; i<(nums.length-k); i++)
        {
            arr[k+i]=nums[i];
        }

        System.out.println(Arrays.toString(arr));
    }
}
