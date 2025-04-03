package java_Leetcode_Problems;

import java.util.Stack;

public class java43_RemoveAdjancent {
    public static void main(String[] args) {

        System.out.println(remove("azxxzy"));

    }
    private static String remove(String str){
        Stack<Character>st=new Stack<>();
        st.push(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(st.isEmpty() ||ch!=st.peek()){
                st.push(ch);
            }
            else{
                st.pop();
            }
        }
//        System.out.println(st);
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < st.size(); i++) {
            char ch= st.get(i);
            sb.append(ch);
        }

        return sb.toString();
    }
}
