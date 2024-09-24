package java8_Recursion;

import java.util.ArrayList;

public class java6_ArrayListnotPassingList {
    public static void main(String[] args ){
        int []arr={1,3,4,5,2,4,6,7,4};
        int target=4;
//        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>ans= findIndexArraylist(arr,target,0);
        System.out.println(ans);


    }
    private static ArrayList<Integer> findIndexArraylist(int[] arr, int target,int i) {
        ArrayList<Integer>list=new ArrayList<>();
        if(i==arr.length){
            return list;
        }
        if(arr[i]==target){
            list.add(i);
        }


       ArrayList<Integer>ansFromBelowFunctionCall=  findIndexArraylist(arr,target,i+1);
        list.addAll(ansFromBelowFunctionCall);
        return list;
    }
}
