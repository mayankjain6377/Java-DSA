package java12_RecursionString;

public class java1_NewStringAfterRemoval {
    public static void main(String[] args) {
//        printString();
        String name="mayank";
        long starttime=System.nanoTime();
        System.out.println(printString2(name));
        long endtime=System.nanoTime();
        System.out.println(endtime-starttime);
//        System.out.println(name);
     }
    //1. this is without recursion
    private static void printString(){
        String str = "mayank";
        char ch = 'a';
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
            } else {
                ans = ans + str.charAt(i);
            }
        }
        System.out.println(ans);


    }

    //2.Now this is solve by recursion
    private static String printString2(String name){
        if(name.isEmpty()){
            return "";
        }
        char  ch=name.charAt(0);
        if(ch=='a'){
            return printString2(name.substring(1));
        }
        else{
            return ch+printString2(name.substring(1));
        }
    }
}
