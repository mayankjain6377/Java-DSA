package java14_LinkedList;

public class java3_CircularLL {
    class Node {
        Node next;
        int value;

        Node(int value) {
            this.value = value;
        }
    }

    Node head;
    Node tail;
    int size;

    java3_CircularLL() {
        this.head = null;
        this.tail = null;
    }

    public void InsertFirst(int value) {
        Node node=new Node(value);
        if(head==null){
            head=tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;

        size++;


    }

    public void delete(int value){
        Node node=head;
        if(node==null){
            return;
        }
        if(node.value==value){
            head=head.next;
            tail.next=head;
            return;

        }
        do {
            Node temp=node.next;
            if(temp.value==value){
                node.next=temp.next;
                break;
            }
            node=node.next;
        }while (node!=head);
    }
    public void Display(){
        Node temp=head;
//        System.out.println(temp.value+" -> ");
      do {
            System.out.print(temp.value+ " - > ");
            temp=temp.next;
        }  while (temp!=head);
        System.out.println(" HEAD ");
    }


    public static void main(String[] args) {
java3_CircularLL list=new java3_CircularLL();
list.InsertFirst(212);
list.InsertFirst(292);
list.InsertFirst(62);
list.InsertFirst(642);
list.Display();
list.delete(292);
list.Display();


    }
}
