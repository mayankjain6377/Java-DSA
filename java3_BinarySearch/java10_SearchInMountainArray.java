package java3_BinarySearch;

public class java10_SearchInMountainArray {
    public static void main(String[] args ){
        int []arr={1,2,3,5,6,7,3,2};
        int target=5;
        int peak =Mountain(arr);
        System.out.println(peak);
int ans =BinarySearch(arr, target,0,peak);
if(ans!=-1)
{
    System.out.println(ans);
}
else {
    int ans2 = BinarySearch(arr, target, peak + 1, arr.length - 1);
    System.out.println(ans2);
} }
    static int Mountain(int []arr)
    {
        int start=0;
        int end=arr.length-1;
        int max=0;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1])
            {
                start=mid+1;
            }
            else if(arr[mid]>arr[mid+1])
            {
                end=mid;

            }
            else
                max = mid;
        }
        max=start;
        return max;
            }
    static int BinarySearch(int []arr,int target,int start,int end)
    {
        while(start<=end)
        {
           int mid=start+(end-start)/2;
            if(arr[mid]<target)
            {
                start=mid+1;
            }
            else if (arr[mid]>target)
            {
                end=mid-1;
            }
            else
//                int ans=mid;
            return mid;
        }
        return -1;
    }
}
