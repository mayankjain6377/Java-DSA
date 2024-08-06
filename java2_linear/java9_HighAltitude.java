package java2_linear;

import java.util.Arrays;

public class java9_HighAltitude {
    public static void main(String[] args) {
         int [] gain={-5,1,5,0,-7};
         int[] ans=new int [gain.length+1];
         int max=0;
         ans[0]=0;
        for (int i = 0; i < gain.length; i++) {
            ans[i+1]=ans[i]+gain[i];


        }
        System.out.println(Arrays.toString(ans));
          max=ans[0];
         for(int i=1;i<ans.length;i++)
         {
             if(ans[i]>max)
             {
              max=ans[i];

             }

         }
        System.out.println(max);
//         return max;
    }
}
