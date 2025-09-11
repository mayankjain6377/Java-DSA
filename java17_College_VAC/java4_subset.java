package java17_College_VAC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class java4_subset {
    public static void main(String[] args) {

//subset("","abc");
        System.out.println(subsetList("","abc"));;
    }
//    public static void subset(String p,String up ){
//        if(up.isEmpty())
//        {
//            System.out.println(p);
//            return;
//        }
//        char ch=up.charAt(0);
//        subset(p+ch,up.substring(1));
//        subset(p,up.substring(1));
//    }

    public static ArrayList<String> subsetList(String p,String up ){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
char ch=up.charAt(0);
        ArrayList<String>left=subsetList(p+ch,up.substring(1));
        ArrayList<String>right=subsetList(p,up.substring(1));

        left.addAll(right);
        return left;
    }


}
