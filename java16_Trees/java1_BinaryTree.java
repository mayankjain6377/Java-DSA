package java16_Trees;

import java.util.Scanner;

 class java1_BinaryTree {

     static public class Node {
        private Node left, right;
        int value;

        public Node(int value) {
            this.value = value;
            left = right = null;
        }
    }

    private Node root;

    // Insert elements into the tree
    public void populate(Scanner sc) {
        System.out.println("Enter the root node value:");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);
    }

    private void populate(Scanner sc, Node node) {
        System.out.println("Do you want to insert left of " + node.value + "? (true/false)");
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter value for left of " + node.value + ":");
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }

        System.out.println("Do you want to insert right of " + node.value + "? (true/false)");
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter value for right of " + node.value + ":");
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }
    }

    // Pretty display method
    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }
        prettyDisplay(node.right, level + 1);

        // Print indentation for formatting
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|------- " + node.value);
        } else {
            System.out.println(node.value);
        }

        prettyDisplay(node.left, level + 1);
    }

    public static void main(String[] args) {
        java1_BinaryTree tree = new java1_BinaryTree();
        Scanner sc = new Scanner(System.in);

        tree.populate(sc);  // Populate the tree
        System.out.println("\nPretty Printed Tree:");
        tree.prettyDisplay(); // Pretty print the tree

        sc.close();
    }
}
