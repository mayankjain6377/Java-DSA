//package java16_Trees;
//
//public class java2_BST {
//    private class Node{
//        private int value;
//        private Node left,right;
//        private int height;
//        public Node(int value){
//            this.value=value;
//        }
//        public int getValue(){
//            return value;
//        }
//
//    }
//  private Node root;
//
//   public java2_BST(){
//
//    }
//    public int height(Node node){
//       if(node==null){
//           return -1;
//       }
//       return node.height;
//    }
//
//    public boolean isEmpty(){
//       return root==null;
//   }
//
//   public void insert(int value){
//
//
//   }
//
//
//   public Node insert(int value,Node node){
//       if(node==null){
//           node =new Node(value);
//           return node;
//       }
//
//        if(value<node.value){
//            if(node.left!=null) {
//                node.left = insert(value, node.left);
//            }
//        }  if(value>node.value){
//            if(node.right!=null) {
//                node.right = insert(value, node.right);
//            }
//        }
//   }
//
//
//
////public void display(){
////       display(root,"root is ");
////}
//
////private void display(Node node ,String details){
////       if(node==null){
////           return;
////       }
////    System.out.println(details+node.getValue());
////       display(node.left,"this is left child of"+node.left);
////       display(node.right,"this is right child of"+node.right);
////}
//
//
//
//
//
//
//    public static void main(String[] args) {
//       java2_BST obj=new java2_BST();
//       obj.display();
//
//
//    }
//}
