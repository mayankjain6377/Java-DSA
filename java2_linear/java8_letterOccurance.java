package java2_linear;
import java.util.ArrayList;
public class java8_letterOccurance {
    public static void main(String[] args ){
        String[] words={"abc","bcd","aaaa","cbc"};
        char x='a';
        ArrayList<Integer>list=new ArrayList<Integer>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++)
            {
                if(words[i].charAt(j) ==x)
                {
                    list.add(i);
                    break;
                }
            }
        }
        int [] ans=new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i]=list.get(i);
        }
//        return ans;


    }
}
