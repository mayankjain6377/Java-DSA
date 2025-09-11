package java16_Trees;


import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class java3_SizeOfBT {
    static public class Node {
        private Node left, right;
        int value;

        public Node(int value) {
            this.value = value;
            left = right = null;
        }
    }

    private Node root;
//private static int count=0;


    public static int  size(Node root){
        if(root==null){
            return 0;
        }
       return 1+size(root.left)+size(root.right);
//       return count;
    }
    public static int  sum(Node root){
        if(root==null){
            return 0;
        }
       return root.value+sum(root.left)+sum(root.right);
    }
    public static int  max(Node root){
        if(root==null){
            return 0;
        }
        return Math.max(root.value,Math.max(max(root.left),max(root.right)));
    }
//    public static int  height(Node root,int count){
//        if(root==null || (root.left==null && root.right==null )){
//            return 0;
//        }
//
//        return 1+Math.max(height(root.left,count+1),height(root.right,count+1));
//    }
    public static void preorder(Node node){
        if(node==null){
            return ;

        }
        System.out.print(node.value+" ");
        preorder(node.left);
        preorder(node.right);
    }
    public static void inorder(Node node){
        if(node==null){
            return ;

        }
        preorder(node.left);
        System.out.print(node.value+" ");
        preorder(node.right);
    }
    public static void postorder(Node node){
        if(node==null){
            return ;

        }
        preorder(node.left);
        preorder(node.right);
        System.out.print(node.value+" ");
    }
    public static void LevelOrderTraversal(Node node){
        Queue<Node>queue=new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()){
            Node temp=queue.peek();

            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }
            System.out.print(temp.value+" ");
            queue.remove();

        }
    }

    public static boolean isBalanced(Node root) {
        return height(root)!=-1;

    }

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=height(root.left);
        if(leftHeight==-1){
            return -1;
        }


        int rightHeight=height(root.right);
        if(rightHeight==-1){
            return -1;
        }

        int diff=Math.abs(leftHeight-rightHeight);
        if(diff>1){
            return -1;
        }


        return 1+Math.max(height(root.left),height(root.right));

    }

    public static Node lowestCommonAncestor(Node root, Node p, Node q) {
        if(root==null||root==p||root==q){
            return root;
        }
        Node leftlca=lowestCommonAncestor(root.left,p,q);
        Node rightlca=lowestCommonAncestor(root.right,p,q);
        if(rightlca==null){
            return leftlca;
        }
        if(leftlca==null){
            return rightlca;
        }
        return root;
    }
//public static boolean

    public static void main(String[] args) {
        Node root=new Node(10);
        Node a =new Node(330);
        Node b =new Node(30);
        root.left=a;
        root.right=b;
        Node c =new Node(40);
        Node d =new Node(50);
        a.left=c;
        a.right=d;
        Node e =new Node(60);
        Node f =new Node(70);
        b.left=e;
        b.right=f;
Node p=e;
Node q=b;
//        System.out.println("The size of BT is: "+size(root));
//        System.out.println("The sum of BT is: "+sum(root));
//        System.out.println("The max of BT is: "+max(root));
//        System.out.println("The height of BT is: "+height(root,0));

//        System.out.print("The preoder will be: ");
//            preorder(root);
//        System.out.println();
//        System.out.print("The inorder will be: ");
//            inorder(root);
//        System.out.println();
//        System.out.print("The postorder will be: ");
//            postorder(root);

//        LevelOrderTraversal(root);
//        System.out.println(isBalanced(root));
        Node temp=lowestCommonAncestor(root,p,q);
        System.out.println(temp.value);



    }
}
