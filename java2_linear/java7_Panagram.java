package java2_linear;

import java.util.Scanner;

public class java7_Panagram {
    public static void main(String[] args) {
        boolean alphabet[] = new boolean[26];
//        String str = "The quick brown fox jumps over the lazy dog";
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'a') && (str.charAt(i) <= 'z')) {
                int index = str.charAt(i) - 'a';
                alphabet[index] = true;
            }

        }
        for (int i = 0; i < alphabet.length; i++) {
            if (!alphabet[i]) {
                System.out.println("Not a panagram");
                break;
            }

        }

    }

}

    //revision
//    public static void main(String[] args) {
//        String str="The quick brown fox jumped over the tree";
//        Boolean[] temp=new Boolean[26];
////        int j=0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i)>=65 && str.charAt(i)<=96){
//                int j=str.charAt(i)-'A';
//                temp[j]=true;
////
//            } else if (str.charAt(i)>=97 && str.charAt(i)<=122) {
//               int j=str.charAt(i)-'a';
//                temp[j]=true;
//
//            }
//            }
//        for ( int i = 0; i < temp.length; i++) {
//            if(!temp[i]){
//                System.out.println("String is not a panagram String");
//            }
//
//
//        }
//        }
//    }

