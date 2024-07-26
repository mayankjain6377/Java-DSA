import java.util.Arrays;

public class java7_shuffle {
    public static void main(String[] args) {
        int [] nums={2,5,1,3,4,7};
        int temp[]=new int [nums.length];
        // for(int i=0;i<nums.length;i=i+2)
        int i=0;
        while(nums.length<=7)
        {
            temp[i]=nums[i];
            temp[i+1]=nums[i+(nums.length/2)];
            i=i+2;
        }
        System.out.println(Arrays.toString(temp));
    }
    
}
