package java10_SortingAlgo;
import java.util.Arrays;

public class java2_MergeSort {
    public static void main(String[] args) {
        int[] arr = {8, 3, 12, 5, 6};
        arr = (MergeSort(arr));
        System.out.println(Arrays.toString(arr));
    }

   private static int[] MergeSort(int[]arr) {
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[]left=MergeSort(Arrays.copyOfRange(arr,0,mid));
        int[]right=MergeSort(Arrays.copyOfRange(arr,mid,arr.length));
       return merge(left,right);
   }
   private static int[]merge(int[]first,int[]second){
       int[]mix=new int[first.length+second.length];
      int i=0;
      int j=0;
      int k=0;
      while(i<first.length&&j< second.length)
      {
          if(first[i]<second[j])
          {
          mix[k]=first[i];
          i++;
          }
          else {
              mix[k]=second[j];
              j++;

          }
          k++;
      }
       while(i< first.length){

               mix[k]=first[i];
               i++;
               k++;

       }
       while(j<second.length){
               mix[k]=second[j];
               j++;
               k++;
       }

        return mix;
   }



//    private static int[] MergeSort(int[] arr) {
//        if (arr.length == 1) {
//            return arr;
//        }
//        int mid = arr.length / 2;
//        int[] left = MergeSort(Arrays.copyOfRange(arr, 0, mid));
//        int[] right = MergeSort(Arrays.copyOfRange(arr, mid, arr.length));
//        return MergeArray(left, right);
//    }
//
//    private static int[] MergeArray(int[] first, int[] second) {
//        int[] mix = new int[first.length + second.length];
//        int i = 0;
//        int j = 0;
//        int k = 0;
//        while (i < first.length && j < second.length) {
//            if (first[i] < second[j]) {
//                mix[k] = first[i];
//                i++;
//            } else {
//                mix[k] = second[j];
//                j++;
//            }
//            k++;
//        }
//
//        //it may be possible  that one array couldn't complete so simple add this into mix array
//        while (i < first.length) {
//            mix[k] = first[i];
//            i++;
//            k++;
//        }
//
//        while (j < second.length) {
//            mix[k] = second[j];
//            j++;
//            k++;
//        }
//        return mix;
//    }


}
