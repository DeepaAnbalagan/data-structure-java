import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class InOrderTraversal {
    BinaryTree root;
    static class BinaryTree{
        int key;
        BinaryTree left,right;
        BinaryTree(int key){
            this.key = key;
            right=left=null;
        }
    }

    public static void main(String args[]){
        InOrderTraversal traversal = new InOrderTraversal();
        traversal.root = new BinaryTree(1);
        traversal.root.left = new BinaryTree(2);
        traversal.root.right = new BinaryTree(3);
        traversal.root.left.left = new BinaryTree(4);
        traversal.root.left.right = new BinaryTree(5);
        System.out.println("Without Recursion");
        usingStack(traversal.root);
        System.out.println("\nwith Recursion");
        printInorder(traversal.root);

    }
    // this is without recursion
    static void usingStack(BinaryTree root){
        Stack<BinaryTree> stack = new Stack<BinaryTree>();
        while(root!=null || stack.size()>0){
            while (root!=null){
                stack.push(root);
                root = root.left;
            }
            BinaryTree node = stack.pop();
            System.out.print(node.key + " ");
            root = node.right;
        }
    }
    // with recursion
    static void printInorder(BinaryTree root) {
        if (root == null) {
            return;
        }
        printInorder(root.left);
        System.out.print(root.key+" ");
        printInorder(root.right);
    }




}
