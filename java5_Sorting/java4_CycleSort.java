package java5_Sorting;

import java.util.ArrayList;
import java.util.Arrays;



public class java4_CycleSort {
    public static void main(String[] args) {

int []arr={1,2,3,5};
  int ans=sort(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.println(ans);
    }
    public static int sort(int []arr)
    {
        ArrayList<Integer>list=new ArrayList<>();
        int i=0;
        while(i<arr.length-1)
        {
            int correct=arr[i]-1;
            if( arr[i] != arr[correct])
            {
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
        for (int j = 0; j <arr.length -1; j++) {
            if(arr[j]!=j)
            {
                list.add(j);
//                return j;
            }

        }
        for (int j = 0; j < list.size()-1; j++) {
            System.out.println(list.get(j));
        }
        return arr.length;

    }
public static void swap(int []arr,int i,int correct)
{
    int temp=arr[i];
    arr[i]=arr[correct];
    arr[correct]=temp;

}

}
