import java.util.Arrays;
import java.lang.Math;
public class java10_RandomNumber {
    public static void main(String[] args) {
int n=5;
int sum=0;
int [] arr=new int [n];
for(int i=0;i<n-1;i++)
{
//    arr[i]=(int)(Math.random()*10-5);
    arr[i]=i+1;
    sum=arr[i]+sum;
}
arr[n-1]=-sum;
//return arr

        System.out.println(Arrays.toString(arr));

    }
}
