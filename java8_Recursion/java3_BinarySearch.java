package java8_Recursion;

public class java3_BinarySearch {
    public static void main(String[] args) {
        int[] arr={2,6,8,12,14,23,25,27,35};
        int target=25;
        System.out.println(search(arr,target,0, arr.length-1));


    }
    static int search(int [] arr,int target,int start,int end)
    {
        if(start>end)
        {
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]<target)
        {
            return search(arr,target,mid+1,end);
        }
        if(arr[mid]>target)
        {
            return search(arr,target,start,mid-1);
        }

        return mid;
    }
}
 