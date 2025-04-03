package java_Leetcode_Problems;

import java.util.Stack;

public class java38_BalancedParanthesis {
    public static void main(String[] args) {
        System.out.println(isValid("([])"));

    }

    public static boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(')
                st.push(')');

            else if(ch=='{')
                st.push('}');
            else if(ch=='[')
                st.push(']');

            else if(st.isEmpty()||st.pop()!=ch)
                return false;

        }
        return st.isEmpty();
    }
}
