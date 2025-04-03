package java14_LinkedList;

 class LinkedList{
  private class Node {
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }
        public Node(Node next, int value) {
            this.next = next;
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public void InsertAtFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;


        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void InsertAtEnd(int val){
        if(tail==null){
            InsertAtFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
//        node.next=null;
        tail=node;
size++;
    }

    public void insert(int val,int index){
        if(index==0){
            InsertAtFirst(val);
            return;
        }
        if (index>=size){
            InsertAtEnd(val);
            return;
        }
        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;


        }
        Node node =new Node(temp.next,val);
        temp.next=node;
        size++;

    }

    public void insertRec(int value,int index,Node temp){
        if(index==0){
            Node node=new Node(value);
            node.next=temp.next;
            temp.next=node;
            size++;
            return;
        }
        insertRec(value,index-1,temp.next);


    }

    public void DeleteAtFirst(){
        int val= head.value;
        head=head.next;
        if (head==null){
            tail=null;
        }
        size--;
        System.out.println("The size of ll is "+size);
    }

    public void DeleteAtEnd(){
//     if(size==1){
//         DeleteAtFirst();
//         return;
//     }
     Node secondLastNode=get(size-2);
//     int val= tail.value;
     tail=secondLastNode;
     tail.next=null;
size--;

    }

    public void Delete(int index){
        Node pre=get(index-1);
        if(index<=1){
            DeleteAtFirst();
            return;
        }
        if(index>=size){
            DeleteAtEnd();
        }
        pre.next=pre.next.next;
        size--;
//        System.out.println(size);
    }

     public void DeleteSorted(){
         Node temp=head;
         while (temp.next!=null){
             if (temp.value==temp.next.value){
                 temp.next=temp.next.next;
                 size--;
             }
             else {
                 temp = temp.next;
             }
         }
         tail=temp;
         tail.next=null;

     }

    public Node get(int index){
        Node node =head;
        for (int i = 0; i < index; i++) {
            node=node.next;

        }
        return node;

//        return 1;

    }

    public Node FindNode(int value){
        Node node=head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.value+" - > ");
            temp=temp.next;

        }
        System.out.println(" NULL ");
    }



    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.InsertAtFirst(221);
        list.InsertAtFirst(213);
        list.InsertAtFirst(213);
//        list.InsertAtEnd(101);
        list.InsertAtFirst(26);
        list.InsertAtFirst(24);
        list.InsertAtFirst(24);
//        list.InsertAtEnd(231);
//        list.insert(101,1 );
        list.display();
//        list.insertRec( );
//        list.DeleteAtFirst();
//        list.DeleteAtEnd();
//        list.display();
//        list.Delete(3);
        list.DeleteSorted();
        list.display();
//        System.out.println( list.FindNode(21));;




    }
}