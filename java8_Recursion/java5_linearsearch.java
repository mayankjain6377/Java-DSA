package java8_Recursion;

public class java5_linearsearch {
    public static void main(String[] args ){
        int [] arr={21,43,2,3,45,211};
       int i=0;
        int target=45;

        int found=isFound(arr,target,i);
        System.out.println(found);



    }
    static int isFound(int []arr,int target,int i){
        if(i==arr.length)
        {
            return -1;
        }
        if(arr[i] == target) {
        return i;
        }
         return isFound(arr,target, i + 1);

    }
}
