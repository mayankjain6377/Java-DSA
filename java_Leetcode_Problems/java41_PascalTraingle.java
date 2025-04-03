//package java_Leetcode_Problems;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class java41_PascalTraingle {
//    public static void main(String[] args) {
////        System.out.println(  NthElement(3,1));
//
//
//    }
//
//    public static List<List<Integer>> pascal(int row){
//        List<List<Integer>>res=new ArrayList<>();
//        if(row==0) return res;
//        List<Integer>first=new ArrayList<>();
//        first.add(1);
//        res.add(first);
//        if(row==1) return res;
//        for (int i = 1; i < row; i++) {
//            List<Integer>sublist=res.get(i-1);
//            ArrayList<Integer>currRow=new ArrayList<>();
//            currRow.add(1);
//
//        }
//
//
//
//
//    }
//
//
//
//
//
//    public static int NthElement(int row,int col){
////        int ans=1;
//        int nem=1;
//        int den=1;
//
//        for (int i = row-1; i >=col ; i--) {
//            nem=nem*i;
//
//        }
//        for (int i = col-1; i >=1 ; i--) {
//            den=den*i;
//
//        }
//
//
//        return nem/den;
//    }
//}
