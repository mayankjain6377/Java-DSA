package java15_Stacks_Queues.queues;

public class queue3_custom {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;

    public queue3_custom() {
        this(DEFAULT_SIZE);
    }

    public queue3_custom(int size) {
        this.data = new int[size];

    }

    public void display(){
        for (int i = 0; i <end ; i++) {
            System.out.print(data[i]+" ");

        }
        System.out.println();
    }

    public boolean enque(int item) {
        if (isFull()) {
            System.out.println("ERROR::stack overflow..........");
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int deque() throws Exception {
        if (isEmpty()) {
            System.out.println("ERROR :: queue underflow ");
            throw new Exception("cannot pop from this queue....");
        }
        int removed = data[0];
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        end--;
        return removed;
    }


    public int front() {
        if (isEmpty()) {
            System.out.println("stack underflow ");
        }
        System.out.println(data[0]);
        return data[0];
    }

    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public static void main(String[] args) throws Exception {

queue3_custom queue=new queue3_custom(5);
queue.enque(23);
queue.enque(243);
queue.enque(323);
queue.enque(723);
queue.enque(123);
queue.display();
queue.deque();
queue.display();
queue.front();
    }
}
