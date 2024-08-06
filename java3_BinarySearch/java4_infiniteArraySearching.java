package java3_BinarySearch;

public class java4_infiniteArraySearching {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 15, 20, 23, 39, 40};
        int target = 11;
        int ans = ans(nums, target);
        System.out.println(ans);
    }

    static int ans(int[] nums, int target) {
        int start = 0;
        int end = 1;
        while (target > nums[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return BinarySearch(nums, target, start, end);
    }

    static int BinarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}


