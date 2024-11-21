public class BinaryTree2 {
    int val;
    BinaryTree2 left;
    BinaryTree2 right;
    BinaryTree2(){}
        BinaryTree2(int val){
            this.val=val;
        }
        BinaryTree2(int val,BinaryTree2 left,BinaryTree2 right){
            this.val=val;
            this.left=left;
            this.right=right;

    }
}
class Match{
    public boolean isIdentical(BinaryTree2 root, BinaryTree2 subRoot){
     if(root==null && subRoot==null){
         return true;
     }
     if(root == null || subRoot==null){
         return false;
     }
     if(root.val==subRoot.val){


     return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
    }
     return false;
    }
    public boolean isSubtree(BinaryTree2 root,BinaryTree2 subRoot){
        if(subRoot==null){
            return true;

        }
        if(root==null){
            return false;
        }
        if(root.val==subRoot.val){
           if(isIdentical(root,subRoot)){
               return true;
           }
        }
        return isSubtree(root.left,subRoot)|| isSubtree(root.right,subRoot);
    }
}
 class BinaryTreeTest {
    public static void main(String[] args) {
        // Create the main binary tree
        BinaryTree2 root = new BinaryTree2(3);
        root.left = new BinaryTree2(4);
        root.right = new BinaryTree2(5);
        root.left.left = new BinaryTree2(1);
        root.left.right = new BinaryTree2(2);

        // Create the subtree to check
        BinaryTree2 subRoot = new BinaryTree2(4);
        subRoot.left = new BinaryTree2(1);
        subRoot.right = new BinaryTree2(2);

        // Create an instance of Match class
        Match match = new Match();

        // Test if subRoot is a subtree of root
        boolean result = match.isSubtree(root, subRoot);
        System.out.println("Is subRoot a subtree of root? " + result);
    }
}
