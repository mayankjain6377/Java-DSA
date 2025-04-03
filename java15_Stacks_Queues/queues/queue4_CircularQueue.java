package java15_Stacks_Queues.queues;

public class queue4_CircularQueue {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int first=0;
    int end = 0;
    int size=0;

    public queue4_CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public queue4_CircularQueue(int size) {
        this.data = new int[size];

    }

    public void display(){
        for (int i = first; i <end ; i++) {
            System.out.print(data[i]+" ");

        }
        System.out.println();
    }


    public boolean enque(int item) {
        if (isFull()) {
            System.out.println("ERROR::stack overflow..........");
            return false;
        }
        end=end%size;
        data[end++] = item;
        size++;
        return true;
    }

    public int deque() throws Exception {
        if (isEmpty()) {
            System.out.println("ERROR :: queue underflow ");
            throw new Exception("cannot pop from this queue....");
        }
        int removed = data[first++];
     first=first% data.length;
     size--;
        return removed;
    }


    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public static void main(String[] args) {
queue4_CircularQueue queue=new queue4_CircularQueue(5);
queue.enque(21);
queue.enque(231);
queue.enque(221);
queue.enque(219);
queue.display();

    }
}
