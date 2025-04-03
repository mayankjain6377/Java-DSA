package java15_Stacks_Queues.stacks;

import java.util.Stack;

public class stack4_InfixToPostFix {
    public static void main(String[] args) {
        System.out.println(infixToPostfix("A+B(*+C+D)*/^"));;

    }
    public static int Prec(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String str) {
        String res = "";
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // If character is operand, add it to output
            if (Character.isLetterOrDigit(c)) {
                res += c;
            }
            // If character is '(', push it to stack
            else if (c == '(') {
                st.push(c);
            }
            // If character is ')', pop and output from stack until '(' is found
            else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    res += st.pop();
                }
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop(); // Pop '('
                }
            }
            // An operator is encountered
            else {
                while (!st.isEmpty() && Prec(c) <= Prec(st.peek())) {
                    res += st.pop();
                }
                st.push(c);
            }
        }

        // Pop all the remaining operators from the stack
        while (!st.isEmpty()) {
            res += st.pop();
        }

        return res;
    }
}
