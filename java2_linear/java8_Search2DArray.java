package java2_linear;

import java.util.ArrayList;
import java.util.Scanner;

public class java8_Search2DArray {
    public static void main(String[] args)
    {
//        int[][] nums={
//                {1,4,5},
//                {2,7,5},
//                {3,6}
//        };

        Scanner sc=new Scanner(System.in) ;
        ArrayList <String> items=new ArrayList<String>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < items.size(); j++) {
                items.add(sc.nextLine());
            }

        }

        int[][] nums=new int[items.size()][items.size()];
        int min=Integer.MIN_VALUE;
        System.out.println(min);
        int target=1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == target) {
                    System.out.println("Found at : [" + i + "]" + "[" + j + "]");
                    return;
                }


            }


        }


    }
}
