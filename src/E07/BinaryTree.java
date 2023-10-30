package src.E07;
import java.util.*;

import javax.swing.tree.TreeNode;
public class BinaryTree {

    public static void main(String[] args) {
        System.out.println("Enter height of binary tree:");
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        Node root = tree.createBinaryTreeByHeight(sc.nextInt());
        sc.close();
        int num = tree.internalPathLength(root,0);
        System.out.println("total paths:"+num);
    }
    // recursive method
    public Node createBinaryTreeByHeight(int height){
        if (height<0){
            return null;
        }
        Node root = new Node(1);
        System.out.println("Node: "+ root.getVal());
        root.setLeft(createBinaryTreeByHeight(height-1));
        root.setRight(createBinaryTreeByHeight(height-1));
        return root;
    }
    // calc internal path length
    public int internalPathLength(Node node, int depth) {
        if (node == null) return 0;
        return depth + internalPathLength(node.getLeft(), depth + 1) + internalPathLength(node.getRight(), depth + 1);
    }

    // traverse methods
}
