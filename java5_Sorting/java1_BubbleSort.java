package java5_Sorting;

import java.util.Arrays;

public class java1_BubbleSort {
    public static void main(String[] args) {
    int []arr={10,1,72,2,2,5};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void BubbleSort(int []arr)
    {
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i ; j++) {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]=temp;
                }

            }
        }
    }
}
