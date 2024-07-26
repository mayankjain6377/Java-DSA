import java.util.Arrays;
import java.util.Scanner;

 class Swap{
    void swap(int []arr,int index1,int index3)
    {
       int temp=arr[index1];
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
 


public class java3_swap {
    public static void main(String[] args) {
        int []arr=new int[5];
        Scanner sc=new Scanner(System.in);        
        for(int i=0;i<arr.length;i++)

        {
            arr[i]=sc.nextInt();
        }
       
        //    Get obj=new Get(); 
        Swap obj=new Swap();
           obj.swap(arr,1,3);

    
    }

    
}
