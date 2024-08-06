package java2_linear;

import java.util.Scanner;

public class java7_Panagram {
    public static void main(String[] args)
    {
        boolean alphabet[] = new boolean[26];
//        String str = "The quick brown fox jumps over the lazy dog";
        Scanner scanner = new Scanner(System.in);
                String str=scanner.nextLine();
str=str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if((str.charAt(i) >= 'a') && (str.charAt(i) <= 'z'))
            {
                int index=str.charAt(i)-'a';
                alphabet[index] =true;
            }

        }
        for (int i = 0; i < alphabet.length; i++) {
            if(alphabet[i]!=true)
            {
                System.out.println("Not a panagram");
            }

        }

    }
}
