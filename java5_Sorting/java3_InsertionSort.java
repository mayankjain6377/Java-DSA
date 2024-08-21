package java5_Sorting;

import java.util.Arrays;

public class java3_InsertionSort {
    public static void main(String[] args ){
int []arr={23,1,10,5,2};
int n= arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j]<arr[j-1])
                {
                    //swap them
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else
                    break;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
