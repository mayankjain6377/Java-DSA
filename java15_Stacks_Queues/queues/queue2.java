package java15_Stacks_Queues.queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class queue2 {
    public static void main(String[] args) {
        Deque<Integer>deque=new ArrayDeque<>();
        deque.add(21);
        deque.add(621);
        deque.add(251);
        deque.add(214);

        deque.addFirst(333);
        deque.removeLast();

        for (int d:deque){
            System.out.println(d);
        }


    }
}
