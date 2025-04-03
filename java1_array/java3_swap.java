import java.util.Arrays;
import java.util.Scanner;

 class Swap<T>{
    void swap(T []arr,int index1,int index3)
    {
         T d;
       T temp=arr[index1];
       arr[index1]=arr[index3];
       arr[index3]=temp;
       System.out.println(Arrays.toString(arr));
    }
}
//     class Get extends Swap{
//     void getdata(int []arr)
//     {
//         System.out.println("the swapped array is ");
//         for(int i=0;i<arr.length;i++)
//         {
//             // swap(arr, i, i);
//             System.out.println(arr[i]);
//         }
//     }
// }
 


public class java3_swap<T> {
    public static void main(String[] args) {
        int []arr;

       
        //    Get obj=new Get(); 
        Swap obj=new Swap();
//           obj.swap(new int[]arr,1,3);

    
    }

    
}
