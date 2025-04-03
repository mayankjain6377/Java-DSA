package java_Leetcode_Problems;

import java.util.Stack;

public class java35_validateStackSequence {
    public static void main(String[] args) {
        System.out.println(  validateStackSequences(new int[]{1,2,3,4,5},new int[]{4,5,3,2,1}));

    }
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack <Integer> stack=new Stack<>();
        int j=0;
        for(int i=0;i<pushed.length;i++){
            stack.push(pushed[i]);
            while(!stack.isEmpty() && stack.peek() ==popped[j]){
                stack.pop();
                j++;
            }
        }
        return j==popped.length;
    }
}
