package java12_RecursionString;

import java.util.ArrayList;

public class java3_SubsetString {
    public static void main(String[] args) {
//        subset("","abc");
//        System.out.println();
ArrayList<String>ans=subString("","abc",new ArrayList<>());
        System.out.println(ans);
    }

//    private static void subset(String p,String up){
//        if(up.isEmpty()){
//            System.out.println(p);
//            return ;
//        }
//        char ch=up.charAt(0);
//        //taking the string
//        subset(p+ch,up.substring(1));
//        //ignoring the string
//        subset(p,up.substring(1));
//    }
//

    private static ArrayList<String> subString(String p,String up,ArrayList<String>list){
        if(up.isEmpty()){
            list.add(p);
            return list;

        }
        char ch=up.charAt(0);
      subString(p+ch,up.substring(1),list);
       return subString(p,up.substring(1),list);

    }
}
