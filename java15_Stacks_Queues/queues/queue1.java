package java15_Stacks_Queues.queues;

import java.util.LinkedList;
import java.util.Queue;

public class queue1 {
    public static void main(String[] args) {
        Queue<Integer>queue=new LinkedList<>();
        queue.offer(21);
        queue.add(221);
        queue.add(241);
        queue.add(121);
        queue.add(721);

        for (int q:queue){
            System.out.println(q);
        }
        System.out.println("removed element"+queue.remove());
    }
}
