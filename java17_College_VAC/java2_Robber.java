package java17_College_VAC;

import java.util.Scanner;

public class java2_Robber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] nums=new int[n];
//        for(int i=0;i<n;i++){
//            nums[i]=sc.nextInt();
//            System.out.print(" ");
//        }
        int[] nums={2,4,5,7,5,6,7,8,9,13};
        int left=0;
        int right=nums.length-1;
       int currsum=0;
        int maxsum=0;

        for( int i=0;i<nums.length-2;i++){
            while(right>=i+2){
                currsum=nums[i]+nums[right];
                maxsum=Math.max(currsum,maxsum);
                right--;
            }
//            left++;
            right=nums.length-1;
        }
        System.out.println(maxsum);

    }
}
