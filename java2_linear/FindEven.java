package java2_linear;

import java.util.Arrays;

public class FindEven {
    public static void main(String[] args) {
        int []nums={12,345,2,6,7896};
        int count=0;
        String[] str=new String[nums.length];
        for (int i = 0; i <nums.length ; i++) {
            str[i] = Integer.toString(nums[i]);


//        System.out.println(Arrays.toString(str))
            if(str[i].length()%2==0) {
                count++;
            }

        }
        System.out.println(count);
    }
}
