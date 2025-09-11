package java17_College_VAC;

import java.util.Arrays;
import java.util.Scanner;

public class java1_Josepheus_problem {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of N:");
        int n=sc.nextInt();
        int[] nums=new int[n];

        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
            System.out.print(" ");
        }

        for (int i:nums){
            System.out.print(i+" ");
        }

//        kill(n,k);

    }
    public static int kill(int n,int k){
        boolean[] temp=new boolean [n];
        int count=0;
        for(int i=1;i<n;i++){
            count++;
            if(count==k && !temp[i]){
                temp[i-1]=true;
                count=0;
            }


        }
        System.out.println(Arrays.toString(temp));
        return 0;
    }

}
