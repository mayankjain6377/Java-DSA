package java2_linear;

public class java3_StringSearch {
    public static void main(String[] args) {
        String name="mayank";
        char ch='p';
      String ans=  Search(name, ch);
        System.out.println(ans);
    }
    static String Search(String name,char ch){
        for (int i = 0; i < name.length(); i++) {
            if(ch==name.charAt(i))
            {
                return "charcter found";
            }


        }
        return "not found";
    }

}
