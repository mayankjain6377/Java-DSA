package java10_SortingAlgo;

import java.util.Arrays;

public class java3_MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 12, 23, 43, 3};
        int start = 0;
        int end = arr.length;
        mergeSort(arr, start, end);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int start, int end) {
        int mid = (start+end)/ 2;
        if (end - start == 1) {
            return;
        }
        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);

        merged(arr, start, mid, end);
    }

    private static void merged(int[] arr, int start, int mid, int end) {
        int i = start;
        int j = mid;
        int k = 0;
        int[] mix = new int[end-start];
        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;

            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < end) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[start+l]=mix[l];

        }
    }


//    private static void mergeSort(int[] arr, int start, int end) {
//        if (end - start == 1) {
//            return;
//        }
//        int mid = (start + end) / 2;
//        mergeSort(arr, 0, mid);
//        mergeSort(arr, mid, end);
//
//        Mergearray(arr, start, mid, end);
//    }
//
//    private static void Mergearray(int[] arr, int start, int mid, int end) {
//        int[] MixAns = new int[end - start];
//        int i = start;
//        int j = mid;
//        int k = 0;
//        while (i < mid && j < end) {
//            if (arr[i] < arr[j]) {
//                MixAns[k] = arr[i];
//                i++;
//            } else {
//                MixAns[k] = arr[j];
//                j++;
//            }
//            k++;
//        }
//        while (i < mid) {
//            MixAns[k] = arr[i];
//            i++;
//            k++;
//        }
//        while (j < end) {
//            MixAns[k] = arr[j];
//            j++;
//            k++;
//        }
//        for (int l = 0; l < MixAns.length; l++) {
//            arr[start + l] = MixAns[l];
//        }
//    }
//


}
