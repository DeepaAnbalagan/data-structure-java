import javax.naming.LimitExceededException;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
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
        LevelOrderTraversal traversal = new LevelOrderTraversal();
        traversal.root = new BinaryTree(1);
        traversal.root.left = new BinaryTree(2);
        traversal.root.right = new BinaryTree(3);
        traversal.root.left.left = new BinaryTree(4);
        traversal.root.left.right = new BinaryTree(5);
        System.out.println("Without Recursion");
        usingQueue(traversal.root);
    }
    static void usingQueue(BinaryTree root){
        Queue<BinaryTree> queue = new LinkedList<BinaryTree>();
        ((LinkedList<BinaryTree>) queue).add(root);
        while(!queue.isEmpty()){
            BinaryTree node = queue.peek();
            System.out.print(node.key+" ");
            queue.poll();
            if(node.left!=null){
                ((LinkedList<BinaryTree>) queue).add(node.left);
            }
            if(node.right!=null){
                ((LinkedList<BinaryTree>) queue).add(node.right);
            }
        }
    }
}
