package java2_linear;

import java.util.Arrays;

public class java3_StringSearch {
    public static void main(String[] args) {

String name="mayank mjainm";
int count=0;

        for (int i = 0; i < name.length(); i++) {
//            System.out.println(name.charAt(i));
            if (name.charAt(i)=='m')
            {
                count++;

            }
        }
        int j=name.charAt(2)-97;
        System.out.println(j);
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println("the m occured "+count +"times");
    }
    }
//        String name="mayank";
//        char ch='p';
//      String ans=  Search(name, ch);
//        System.out.println(ans);
//    }
//    static String Search(String name,char ch){
//        for (int i = 0; i < name.length(); i++) {
//            if(ch==name.charAt(i))
//            {
//                return "charcter found";
//            }
//
//
//        }
//        return "not found";
//    }
//
//}
