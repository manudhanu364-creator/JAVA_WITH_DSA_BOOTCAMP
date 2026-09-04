package DAY11;

import org.w3c.dom.Node;

public class Preorder {

    private static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Preorder traversal of binary tree is:");
        preorderTraversal(root);
    }

    private static void preorderTraversal(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.value + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }
}
