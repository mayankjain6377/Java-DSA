package java16_Trees;

public class java2_BST {
    private class Node{
        int value;
        private Node left,right;
        int height;

        public Node(int value){
            this.value=value;
        }

    }
  private Node root;

   public java2_BST(){

    }
    public int height(Node node){
       if(node==null){
           return -1;
       }
       return node.height;
    }

    public boolean isEmpty(){
       return root==null;
   }

   




    public static void main(String[] args) {


    }
}
