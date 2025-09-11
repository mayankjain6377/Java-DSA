package java17_College_VAC;

public class java3_removeString {
    public static void main(String[] args) {
        System.out.println(skipstring("whatisthemayankjain"));

    }

    public static String skipstring(String name){
        if(name.isEmpty()){
            return "";
        }
        char ch=name.charAt(0);
        String str="mayank";
        if(name.startsWith(str)){
            return skipstring(name.substring(str.length()));
        }
        else {
            return ch+skipstring(name.substring(1));
        }
    }
}
