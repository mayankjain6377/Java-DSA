package java12_RecursionString;

public class java2_SkipString {
    public static void main(String[] args) {

String name="bahfmayankhfhf";
        System.out.println(skipString(name));

    }

    private static String skipString(String name) {
        if(name.isEmpty())
        {
            return "";

        }
        char ch=name.charAt(0);
        if(name.startsWith("mayank")){
            return skipString(name.substring(7));

        }
        else {
            return ch+skipString(name.substring(1));
        }
    }
}
