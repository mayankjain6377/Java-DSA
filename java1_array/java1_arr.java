import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class java1_arr{

public static void main(String[] args) {
    int[] arr=new int [5];
    Scanner sc=new Scanner(System.in);

for (int i=0;i<arr.length;i++)
{
    arr[i]=sc.nextInt();
}
System.out.println("the array is ");
for (int element : arr) {
    // arr[i]=sc.nextInt();
    System.out.print(" "+element);
}

// for(int i:arr)
// {
//     // System.out.println(i);
// }
change(arr);

System.out.println(Arrays.toString(arr)+1);
}
static void change (int[] arr)
{
    arr[0]=88;

}
}