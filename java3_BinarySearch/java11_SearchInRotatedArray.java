package java3_BinarySearch;

public class java11_SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6,8, 1, 2, 3};
        System.out.println(findPivot(arr)+1);
//        System.out.println(search(arr,));
    }

    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (pivot == -1) {
            return BinarySearch(nums, target, 0, nums.length - 1);
        }
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target >=nums[0])
        {
            return BinarySearch(nums,target,0,pivot-1);
        }

            return BinarySearch(nums,target,pivot+1,nums.length-1);
    }


    static int BinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else
//                int ans=mid;
                return mid;
        }
        return -1;
    }

    static int findPivot(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }


}
