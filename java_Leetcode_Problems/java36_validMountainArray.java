package java_Leetcode_Problems;

public class java36_validMountainArray {
    public static void main(String[] args) {

        System.out.println(validMountainArray(new int[]{1,2,3,4,5,4,3,2,1,0}));;
    }
    public static boolean validMountainArray(int[] arr) {
        if(arr.length < 3) return false;
        int i=0;
        int j=arr.length-1;
        while(i+1<arr.length-1&&arr[i+1]>arr[i]){
            i++;
        }
        while(arr[j-1]>arr[j] && j-1>0){
            j--;
        }


        return i==j;
    }
}
