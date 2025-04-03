package java11_numberSystem;

import java.util.Arrays;

public class java2_onceElement {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4, 1, 2, 1, 3, 6, 4};
        int[] arr2 = {2,2, 4,2,7,7,8,7,8,8};
//        FindUniqueElemenmt(arr1);
        uniqueElementThrice(arr2);
    }


    //find once element
    private static void FindUniqueElemenmt(int []arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            temp ^= arr[i];
        }
        System.out.println(temp);
}


//find three times element
    private static void uniqueElementThrice(int []arr2){
       int[] bitcount=new int[32];
        for (int i = 0; i < arr2.length ; i++) {
            for (int j = 0; j < 32; j++) {

                bitcount[j]+=(arr2[i]>>j)&1;
            }


        }
        System.out.println(Arrays.toString(bitcount));
        int result=0;
        for (int i = 0; i < 32; i++) {
            if (bitcount[i]%3!=0)
            {
                result|=(1<<i);

            }

        }
        System.out.println(result);
    }


}
