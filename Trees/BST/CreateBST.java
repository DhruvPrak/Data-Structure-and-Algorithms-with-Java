package Trees.BST;

import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class CreateBST {
    Node root;

    Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    void preorder(Node root) {
        if (root != null){
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    void postorder (Node root) {
        if (root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CreateBST tree = new CreateBST();

        System.out.print("Enter the number of nodes: ");
        int n = sc.nextInt();

        System.out.print("Enter the values: ");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            tree.root = tree.insert(tree.root, value);
        }

        System.out.print("Inorder traversal of BST: ");
        tree.inorder(tree.root);

        sc.close();
    }
}
