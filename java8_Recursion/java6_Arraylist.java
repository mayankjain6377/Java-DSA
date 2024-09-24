package java8_Recursion;

import java.util.ArrayList;

public class java6_Arraylist {
    public static void main(String[] args ){
        int []arr={1,3,4,5,2,4,6,7};
        int target=12;
//        ArrayList<Integer>list=new ArrayList<>();
       ArrayList<Integer>ans= findIndexArraylist(arr,target,0,new ArrayList<>());
        System.out.println(ans);


    }

    private static ArrayList<Integer> findIndexArraylist(int[] arr, int target,int i, ArrayList<Integer>list) {

        if(i==arr.length){
            return list;
        }
        if(arr[i]==target){
            list.add(i);

        }


    return findIndexArraylist(arr,target,i+1,list);
    }
}
