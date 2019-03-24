
 public class IsBinarySearchTree {
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
        IsBinarySearchTree tree = new IsBinarySearchTree();
        tree.root = new BinaryTree(4);
        tree.root.left = new BinaryTree(2);
        tree.root.right = new BinaryTree(5);
        tree.root.left.left = new BinaryTree(1);
        tree.root.left.right = new BinaryTree(3);
        if (isBstUtil(tree.root))
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");

    }

    static boolean isBstUtil(BinaryTree root){
       return isBst(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    static  boolean isBst(BinaryTree root,  int min, int max){
        if(root == null){
            return  true;
        }
        if(root.key < min || root.key > max){
            return  false;
        }
        return (isBst(root.left, min, root.key-1) && (isBst(root.right, root.key+1, max)));

    }
}


