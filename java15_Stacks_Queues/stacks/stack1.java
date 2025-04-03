package java15_Stacks_Queues.stacks;

import java.util.Stack;

public class stack1 {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        stack.push(21);
        stack.push(1);
        stack.push(321);
        stack.push(251);
        stack.push(216);
      for (int st:stack){
          System.out.println(st);
      }
        System.out.println("Popped element: "+stack.pop());;
        System.out.println("peak element: "+stack.peek());
        System.out.println("size of stack is: "+stack.size());
    }
}
