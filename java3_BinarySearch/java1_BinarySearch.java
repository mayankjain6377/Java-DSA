package java3_BinarySearch;
public class java1_BinarySearch {
    public static void main(String[] args)
    {
        System.out.println("java1_BinarySearch");
        int [] nums={1,2,3,4,5,6,7,8};
        int target=3;
        int index=binarySearch(nums,target);
        System.out.println(index);
    }
    static public int binarySearch(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int i=0;
        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(target<nums[mid]) {
                end = mid- 1;
            }
            else if (target > nums[mid]) {
                    start = mid+ 1;
                }
            else {
                return mid;
            }
        }
        return -1;
    }
}
