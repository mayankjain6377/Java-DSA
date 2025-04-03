package java_Leetcode_Problems;

import java.util.Arrays;

public class java25_CountingBits {
    public static void main(String[] args) {
        countBits(5);

    }
    public static int[] countBits(int n) {
        int []ans=new int[n+1];
        for (int i = 0; i <=n; i++) {
            int count=0;
            int num=i;
            while (num>0){
                if((num&1)==1){
                    count++;
                }
                num=num>>1;
            }
            ans[i]=count;
            System.out.println(count);


        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }

}
