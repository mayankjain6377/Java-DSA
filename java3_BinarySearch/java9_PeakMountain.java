package java3_BinarySearch;

public class java9_PeakMountain {
    public static void main(String[] args ){
int []arr={1,2,3,5,6,4,3,2};
//        int []arr={1,6,13,14,12,6,5,3,2};
int ans=Mountain(arr);
        System.out.println(ans);

    }
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
//            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]) {
//                max = mid;
//                return max;
//            }
            else
            max = mid;
//            return max;
        }
max=arr[start];
        return max;

    }
}
