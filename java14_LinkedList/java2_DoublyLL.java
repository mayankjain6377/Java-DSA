package java14_LinkedList;

public class java2_DoublyLL {
    class Node {
        private int value;
        private Node prev;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(Node next, Node prev, int value) {
            this.next = next;
            this.prev = prev;
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    java2_DoublyLL() {
        this.size = 0;
    }

    public void insertAtFirst(int value) {
        Node node = new Node(value);
        if (head != null) {
            head.prev = node;
        }
        node.next = head;
        node.prev = null;
        head = node;
        size++;
    }

    public void insertAtLast(int value) {
        Node node = new Node(value);
        Node last = head;
        node.next = null;
        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        size++;
    }

    public void insertIndex(int after,int val){
        Node temp =FindNode(after);

        if(temp==null){
            System.out.println("Doesn't Exists");
            return;
        }
        Node node =new Node(val);
        node.next=temp.next;
        temp.next=node;
        node.prev=temp;
        if (node.next!=null) {
            node.next.prev = node;
        }
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

    public void display() {
        Node temp = head;
        Node last = null;
        while (temp != null) {
            System.out.print(temp.value + " - > ");
            last = temp;
            temp = temp.next;

        }

        System.out.println(" NULL ");

        System.out.println("Printing in reverse manner...");
        while (last != null) {
            System.out.print(last.value + " - > ");
            last = last.prev;
        }
        System.out.println(" NULL ");
    }

//    public void displayRev(){
//        Node last=tail;
//        while (last!=null){
//            System.out.print(last.value+" - > ");
//            last=last.prev;
//        }
//        System.out.println(" NULL ");
//    }


    public static void main(String[] args) {
        java2_DoublyLL list = new java2_DoublyLL();
//        LinkedList obj=new LinkedList();
        list.insertAtFirst(12);
        list.insertAtFirst(132);
        list.insertAtFirst(1322);
//        list.display();
        list.insertAtLast(123);
        list.insertAtLast(113);
        list.display();
    list.insertIndex(123,344);
        list.display();

//        list.displayRev();

    }
}
