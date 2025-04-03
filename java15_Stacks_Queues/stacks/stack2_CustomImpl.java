package java15_Stacks_Queues.stacks;

public class stack2_CustomImpl {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    int ptr=-1;


    public stack2_CustomImpl(){
        this(DEFAULT_SIZE);
    }

    public stack2_CustomImpl(int size) {
this.data=new int[size];

    }


    public boolean push(int item ){
        if(isFull()){
            System.out.println("ERROR::stack overflow..........");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            System.out.println("ERROR :: Stack underflow ");
            throw new Exception("cannot pop from this stack....");
        }
        int removed=data[ptr];
        ptr--;
      return removed;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("stack underflow ");
        }
        return data[ptr];
    }





    public boolean isFull(){
        return ptr== data.length-1;
    }
    public boolean isEmpty(){
        return ptr==-1;
    }

    public static void main(String[] args) throws Exception {

        stack2_CustomImpl stack=new stack2_CustomImpl(5);
        stack.push(34);
        stack.push(354);
        stack.push(346);
        stack.push(234);
        stack.push(344);
        stack.push(349);
//        System.out.println( stack.pop());
//        System.out.println(stack.peek());

    }
}
