import java.util.Arrays;
import java.util.Scanner;


class Reverse {
    public void reverse(int[] arr, int start, int end) {
        // System.out.println("reversed array is ");
        // for(int i=arr.length-1;i>-1;i--)
        // {
        // System.out.println(arr[i]);
        // }
System.out.println("reversed array is ");
        // for (int i = start; i < end/2; i++) {
            for (int j = start; j < end;j++) {

                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
                start++;
                end--;
            }
            System.out.println(Arrays.toString(arr));
            // start++;
        // }

    }
}

public class java4_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++)

        {
            arr[i] = sc.nextInt();
        }
        Reverse obj = new Reverse();
        obj.reverse(arr, 0, arr.length-1);
    }
}
