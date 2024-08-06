package java3_BinarySearch;
import java.math.*;
public class java12_SplitArrayLargestSum {
    public static void main(String[] args) {
        int []nums={7,2,5,10,8};
        int m=2;
       int ans= splitArray(nums,m);
        System.out.println(ans);
    }
    public static int splitArray(int []nums,int m)
    {
        int start=0;
        int end=0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }
            //Binary Search start from here
            while(start<end) {
                int mid = start + (end - start) / 2;
                int sum = 0;
                int pieces = 1;
                for (int num : nums) {
                    if (sum + num > mid) {
                        sum = num;
                        pieces++;
                    } else {
                        sum = sum + num;
                    }
                }
                if (pieces > m) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            }
            return end;
            }
    }

