package java10_SortingAlgo;
import java.util.Arrays;

public class java1_AllSorting {
    public static void main(String[] args) {
        int[] arr = {2, 11, 1, 3, 0, 7};
//        Bubble(arr, arr.length - 1, 0);
//        System.out.println(Arrays.toString(arr));
//        selection(arr,arr.length-1,0,0);
//        System.out.println(Arrays.toString(arr));
        insertion(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }



    private static void Bubble(int[] arr, int length, int i) {
        if (length == 0) {
            return;
        }
        if (i < length) {
            if (arr[i] > arr[i + 1]) {
                //swap
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            Bubble(arr, length, i + 1);
        } else {
            Bubble(arr, length - 1, 0);
        }


//      Bubble(arr,length-1,i+1);
    }

    //selection sort :- choose the largest element and put it to end of the arr
    private static void selection(int []arr,int i,int j,int max){
if(i==0){
    return;
}
if(i>j) {
    if (arr[j] > arr[max]) {
        selection(arr, i, j + 1, j);
    } else {
        selection(arr, i, j + 1, max);
    }
}
    else{
        int temp=arr[max];
        arr[max]=arr[i-1];
        arr[i-1]=temp;
        selection(arr,i-1,j,0);
    }


    }

    private static void insertion(int[] arr, int i, int j) {
        if(i==0){
            return;
        }
        if(i>j){
            if(arr[j]>arr[j+1]){
                //swap the element
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            insertion(arr,i,j+1);
            if(j==i-1){
                insertion(arr,i-1,0);
            }
        }
    }

}
