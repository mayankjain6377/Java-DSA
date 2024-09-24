package java8_Recursion;

public class java4_RecusrionArray {
    public static void main(String[] args) {
        int[] arr={1,3,4,12};
        int i=0;
        boolean sorted = isSorted(arr,i);
        System.out.println(sorted);
    }
    public static boolean isSorted(int []arr,int i){
if(i==arr.length-1){
    return true;
}

return(arr[i] < arr[i + 1] && isSorted(arr, i+1));
    }
}
