package java5_Sorting;

import java.util.ArrayList;
import java.util.Arrays;



public class java6_MissingNumber {
    public static void main(String[] args) {
        int []arr={4,16,5,4,3,2,1};
       findpivot(arr);
//        System.out.println(ans);


        }

    private static void findpivot(int[] arr) {
        int start=0;
        int end=arr.length-1;
    int temp=0;

        while(start<=end){
           int mid=start+(end-start)/2;
            if(arr[start]<arr[mid]){
                //search in right side
                start=mid+1;
            } else if (arr[start]>arr[mid]){
                end=mid-1;

            }

temp=arr[mid];
//            return arr[mid];
        }
        System.out.println(temp);
//return mid;
}






//    public static void main(String[] args) {
//        int []arr={4,3,2,7,8,2,3,1};
//       int ans= sort(arr);
//        System.out.println(ans);
//        System.out.println(Arrays.toString(arr));
//    }
//    public static int  sort(int []arr)
//    {
//        ArrayList<Integer>list=new ArrayList<>();
//        int i=0;
//        while(i< arr.length)
//        {
//            int correct=arr[i]-1;
//            if( arr[i] != arr[correct])
//            {
//                swap(arr,i,correct);
//            }
//            else {
//                i++;
//            }
//        }
////        int n=1,k=0;
//        for (int j = 0; j < arr.length-1; j++) {
//            if(arr[j]!=j+1)
//            {
//                list.add(arr[j]);
//            }
//
//        }
//        for (int k = 0; k < list.size(); k++) {
//            System.out.println(list.get(k));
//
//        }
//return arr.length;
//    }
//    public static void swap(int []arr,int i,int correct)
//    {
//        int temp=arr[i];
//        arr[i]=arr[correct];
//        arr[correct]=temp;
//
//    }

}
