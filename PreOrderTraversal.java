import java.util.Stack;
import java.util.stream.StreamSupport;

public class PreOrderTraversal {
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
        PreOrderTraversal traversal = new PreOrderTraversal();
        traversal.root = new BinaryTree(1);
        traversal.root.left = new BinaryTree(2);
        traversal.root.right = new BinaryTree(3);
        traversal.root.left.left = new BinaryTree(4);
        traversal.root.left.right = new BinaryTree(5);
        System.out.println("Without Recursion");
        usingStack(traversal.root);
        System.out.println("\nwith Recursion");
        printPreOrder(traversal.root);
    }

    static void usingStack(BinaryTree root){
        Stack<BinaryTree> stack = new Stack<BinaryTree>();
        stack.push(root);
        while (!stack.isEmpty()){
            BinaryTree node = stack.peek();
                System.out.println(node.key);
                stack.pop();
                if(node.right!=null){
                    stack.push(node.right);
                }
                if(node.left !=null )
                stack.push(node.left);
        }
    }
    static void printPreOrder(BinaryTree root){
        if(root == null){
            return;
        }
        System.out.println(root.key);
        printPreOrder(root.left);
        printPreOrder(root.right);
    }
}
