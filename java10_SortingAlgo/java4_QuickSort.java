package java10_SortingAlgo;

import java.util.Arrays;

public class java4_QuickSort {
    public static void main(String[] args) {
int[]arr={8, 4, 7, 1, 3, 5, 2, 6};
int low=0;
int high=arr.length-1;
long starttime=System.nanoTime();
quicksort(arr,low,high);
        long endtime=System.nanoTime();
        System.out.println(Arrays.toString(arr));
        System.out.println("the runtime is:"+(endtime-starttime));
    }

    private static void quicksort(int[] arr, int low, int high) {
    //Base condition
        if(low>=high){
            return;
        }
        int start=low;
        int end=high;
        int pivot=arr[start];

        while(start<=end){
            while (arr[start]<pivot){
                start++;
            }
            while (arr[end]>pivot){
                end--;
            }
        if(start<=end){
            //swap the element
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        }
        quicksort(arr,0,end);
        quicksort(arr,start,high);


    }
}
