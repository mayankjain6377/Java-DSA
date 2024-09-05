package java6_String;

import java.util.Arrays;

public class java2_Performanace {
    public static void main(String[] args) {


//    String str="";
//        for (int i = 0; i < 26; i++) {
//            char ch=(char) ('a' +i);
//            str=str+ch;
//        }
//        System.out.print(str);


//        StringBuilder str=new StringBuilder();
//        for (int i = 0; i < 26; i++) {
//            char ch=(char) ('a' +i);
//            str.append(ch);
//
//        }
//        System.out.println(str.reverse());
//        System.out.println(str.delete(1,3));
//        System.out.print(str.toString());
        System.out.println(ispalindrome());
        }

static public boolean ispalindrome() {
    String str="kanak";

    for (int i = 0; i <= str.length()/2; i++) {

        char start=str.charAt(i);
        char end=str.charAt(str.length()-1-i);
        if(start!=end) {
            System.out.println(false);
        }


    }
    return true;
    }



//        String arr=Arrays.toString(name.split(" "));
//        for (int i = arr.length()-2; i >0 ; i--) {
//
//            System.out.print(arr.charAt(i));
//        }


    }

