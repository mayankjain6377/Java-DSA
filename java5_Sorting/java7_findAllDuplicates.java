package java5_Sorting;

import java.util.Arrays;

public class java7_findAllDuplicates {
    public static void main(String[] args) {
        int[] arr = { 7,8,9,10,11};
//        int[] arr = { 4, 3,-1, 2,5,7,8, 1,};
        sort(arr);
//        System.out.println(sort(arr));


    }

    public static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i]>0&& arr[i]<= arr.length&&arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else
                i++;
        }
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1)
            {
//                System.out.println("duplicate number is "+arr[j]);
                System.out.println("lost number should be " +(j+1));
            break;
            }
        }
//        return arr;
    }





    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
       arr[x] = arr[y];
        arr[y] = temp;
    }
}
