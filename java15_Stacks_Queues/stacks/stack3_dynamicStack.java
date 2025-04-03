package java15_Stacks_Queues.stacks;

public class stack3_dynamicStack extends stack2_CustomImpl{

    public stack3_dynamicStack(){
        super();
    }
    public stack3_dynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item) {
        if(this.isFull()){
            int[]temp=new int[data.length*2];
            for (int i = 0; i < data.length; i++) {
                temp[i]=data[i];
            }
            data=temp;
        }
        return super.push(item);
    }

    public static void main(String[] args) {
stack3_dynamicStack stack=new stack3_dynamicStack();

        stack.push(34);
        stack.push(354);
        stack.push(346);
        stack.push(234);
        stack.push(344);
        stack.push(349);

    }
}
