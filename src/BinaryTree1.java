import java.util.*;
import java.util.LinkedList;

public class BinaryTree1 {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{

        static int idx=-1;
        //sari nodes ko lega, and root node ko return kr dega
        public Node buildTree(int nodes[]){
        idx++;
        if(nodes[idx]==-1){
            return null;
        }
        Node newNode=new Node(nodes[idx]);
        newNode.left=buildTree(nodes);
        newNode.right=buildTree(nodes);

        return newNode;
        }
    }

    //preorder Traversal sequence
    public static void preorder(Node root){
        //base case
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");  //print root
        preorder(root.left);   //call for left
        preorder(root.right);   //call for right

    }
    //Inorder Traversal Sequence
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    //PostOrder traversal
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    //Level order Traversal
    public static void levelOrder(Node root){
        if(root==null){
            return;
        }
      Queue<Node> q=new LinkedList<>();   //to store the nodes
       q.add(root); //first add root noode and null in the queue
       q.add(null);

       while(!q.isEmpty()){
           Node currNode=q.remove();
           if(currNode==null){
               System.out.println();
               if(q.isEmpty()){
                   break;
               }
               else{
                   q.add(null);
               }
           }else{
               System.out.print(currNode.data+" ");
               if(currNode.left!=null){
                   q.add(currNode.left);

               }
               if(currNode.right!=null){
                   q.add(currNode.right);
               }
           }
       }
    }
    /*Q.1 Count total no. of nodes
    public static int countOfNodes(Node root){
      if(root==null){
          return 0;
      }
      int leftNodes=countOfNodes(root.left);
      int rightNodes=countOfNodes(root.right);

      return leftNodes+rightNodes+1;
    }
    */
    //Q.2 Sum of total no. of nodes

    public static int sumOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftSum=sumOfNodes(root.left);
        int rightSum=sumOfNodes(root.right);

        return leftSum+rightSum+root.data;
    }
    public static int height(Node root){
       if(root ==null){
           return 0;
       }
        int leftHeight = height(root.left);    //call left subtree for leftHeight
        int rightHeight= height(root.right);

        int myHeight = Math.max(leftHeight,rightHeight)+1;

        return myHeight;
    }
    public static int diameter(Node root){
        if(root ==null){
            return 0;
        }

        int dia1=diameter(root.left);
        int dia2=diameter(root.right);
        int dia3=height(root.left)+height(root.right)+1;

        return Math.max(dia3, Math.max(dia1,dia2));
    }
    static class TreeInfo{
        int ht;
        int dia;
       TreeInfo(int ht,int dia){
           this.ht=ht;
           this.dia=dia;
       }

    }
    public static TreeInfo diameter2(Node root){
        //base case
        if(root ==null){
            return new TreeInfo(0,0);
        }
        //get information of tree
        TreeInfo left=diameter2(root.left);
        TreeInfo right=diameter2(root.right);
         int myHeight = Math.max(left.ht,right.ht);

         int dia1=left.dia;
         int dia2=right.dia;
         int dia3=left.ht+right.ht+1;

         int mydia=Math.max(Math.max(dia1,dia2),dia3);

         TreeInfo myInfo=new TreeInfo(myHeight,mydia);
         return myInfo;

    }
    public static void main(String []args){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        //System.out.println(root.data);  //agar root sahi build huaa hain to root ke data me 1 print ho ke ayega
        //preorder(root);
        //inorder(root);
        //postorder(root);
        //levelOrder(root);
        //System.out.println(countOfNodes(root));
       // System.out.println(sumOfNodes(root));
        //System.out.println(height(root));
        //System.out.println(diameter(root));
        System.out.println(diameter2(root));
    }
}
