
//This is the LeetCode problem number #17 Letter combination arrangement
package java12_RecursionString;
import java.util.ArrayList;
public class java6_LetterCombination {
    public static void main(String[] args) {
        ArrayList<String> ans = combination("", "28", new ArrayList<>());
        System.out.println(ans);
    }
    private static ArrayList<String> combination(String p, String up, ArrayList<String> result) {
        if (up.isEmpty()) {
            result.add(p);
            return result;
        }
        String[] arr = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        int digit = up.charAt(0) - '0';
        String letters = arr[digit - 2];
        for (char ch : letters.toCharArray()) {
            combination(p + ch, up.substring(1), result);
        }
        return result;
    }
}



//import java.util.ArrayList;
//
//public class java6_LetterCombination  {
//    public static void main(String[] args) {
//        ArrayList<String>ans=combination("","28",new ArrayList<>());
//        System.out.println(ans);
//    }
////    static ArrayList<String>result=new ArrayList<>();
//    private static ArrayList<String> combination(String p, String up,ArrayList<String>result) {
//        if(up.isEmpty()){
//            result.add(p);
//            return result;
//        }
//            int digit=up.charAt(0)-'0';
//
//String[]arr={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
////        for (int i = 0; i < arr.length-1 ; i++) {
//////            arr[i];
////            up=arr[digit];
////
////        }
////        up=arr[digit-2];
//        char ch=up.charAt(0);
//        for (int i = 0; i < arr[digit-2].length(); i++) {
//            combination(p+ch,up.substring(1),result);
//
//        }
////        System.out.println("the up string is "+up);
//        return result;
//    }
//}











//package java12_RecursionString;
//
//import java.util.ArrayList;
//
//public class java6_LetterCombination  {
//    public static void main(String[] args) {
//        ArrayList<String>ans=combination("","8",new ArrayList<>());
//        System.out.println(ans);
//
//    }
//static ArrayList<String>result=new ArrayList<>();
//    private static ArrayList<String> combination(String p, String up,ArrayList<String>result) {
//        if(up.isEmpty()){
//            result.add(p);
//            return result;
//        }
//        int digit=up.charAt(0)-'0';
//
//        if(digit==8){
//            for (int j = 19; j <22 ; j++) {
//
//                char ch=(char)('a'+j);
//                combination(p+ch,up.substring(1),result);
//            }
//        }
//        //int digit=50-48   because ascii value of '0' is 48
//        else {
//            for (int i = (digit - 2) * 3; i < (digit - 1) * 3; i++) {
//                if (digit == 7 || digit == 9) {
//                    for (i = (digit - 2) * 3; i < ((digit - 1) * 3) + 1; i++) {
//                        char ch = (char) ('a' + i);
//                        combination(p + ch, up.substring(1), result);
//                    }
//                    break;
//                }
//                char ch = (char) ('a' + i);
//                combination(p + ch, up.substring(1), result);
//            }
//        }
//        return result;
//    }
//}
