package java8_Recursion;
public class java10_RotatedArray {
    public static void main(String[] args) {
int []arr={6,7,8,9,23,2,3,4,5};
int target=3;
int ans=findTarget(arr,target,0,arr.length-1);
        System.out.println(ans);
    }

    private static int findTarget(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1; // Target not found
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[start]<=arr[mid]){
            if(target>=arr[mid] && arr[mid]<target){
//                end=mid-1;
                return findTarget(arr,target,start,mid-1);

            }
            else {
                return findTarget(arr,target,mid+1,end);
            }
        }
        if (target > arr[mid] && target <= arr[end]) {
            return findTarget(arr, target, mid + 1, end);
        }
        return findTarget(arr,target,start,mid-1);

    }
}
