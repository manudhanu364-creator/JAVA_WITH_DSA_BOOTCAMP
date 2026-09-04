package DAY10;

public class BinaryTreeMaximum {

    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            this.data = value;
            this.left = null;
            this.right = null;
        }
    }

    static int findMax(Node root) {
        if (root == null) {
            throw new IllegalArgumentException("Tree is empty");
        }

        int leftMax = root.left != null ? findMax(root.left) : root.data;
        int rightMax = root.right != null ? findMax(root.right) : root.data;

        return Math.max(root.data, Math.max(leftMax, rightMax));
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(20);

        System.out.println("Maximum value in the binary tree is: " + findMax(root));
    }
}
