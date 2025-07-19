// Covers representing binary tree from syllabus
import java.util.*;
public class binarytreeyt {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){ // constructor jismai humara sara data store hoga
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{

        static int idx=-1; // ye index humara -1 se start hoga kyuki humara jo array hai usme -1 ka matlab hai ki koi node nahi hai. esko hum bar bar increment krenge jab humara koi node nahi hoga

        public static Node buildTree(int nodes[]){ // ye function humari sari ki sari nodes ko lega aur return krdega root node ko

            idx++; // index -1 se 0 hogya

            if(nodes[idx]== -1){
                return null; // -1 represents null node. Null node ek bar bngyi toh uska na koi left child hota h na right esliye null return krdiya
            }

            Node newNode = new Node(nodes[idx]); // ab hume baki data k liye apni nayi node bnani h

            newNode.left= buildTree(nodes); //ab humara left child bna
            newNode.right= buildTree(nodes); // ab humara right child bna
            return newNode; // ab humara naya node bna toh usko return krdo


        }

        public static void preorder(Node root){

        if(root==null){
            return;
        }

        System.out.println(root.data+" ");
        preorder(root.left);
        preorder(root.right);
        }

        public static void inorder(Node root){
            if(root==null){
                return;
            }

            inorder(root.left);
            System.out.println(root.data+" ");
            inorder(root.right);
        }


        public static void postorder(Node root){
            if(root==null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data+" ");
        }

        public static void levelOrder(Node root){
            if(root==null){
                return;
            }
            Queue<Node> q= new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode= q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.println(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }

                }
            }

        }
    }




    public static int countOfNodes(Node root){
        if(root==null){
            return 0;
        }

        int leftNodes= countOfNodes(root.left);
        int rightNodes= countOfNodes(root.right);

        return leftNodes+rightNodes+1;
    }

    public static int sumOfNodes(Node root){
        if(root==null){
            return 0;
        }

        int leftSum= sumOfNodes(root.left);
        int rightSum= sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    public static int height(Node root){

        if(root==null){
            return 0;
        }
        int leftHeight= height(root.left);
        int rightHeight= height(root.left);

        int myHeight=Math.max(leftHeight, rightHeight)+1;

        return myHeight;
    }

    public static int diameter(Node root){
        if(root==null){
            return 0; 
        }
        int diam1= diameter(root.left);
        int diam2= diameter(root.right);
        int diam3= height(root.left)+ height(root.right)+1;
        return Math.max(diam3, Math.max(diam1,diam2));
    }
    


    public static void main(String[] args){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree(); // binary tree bna liya ya keh skte ho ek object
        Node root= tree.buildTree(nodes); // ab humne root node ko bna liya
        System.out.println(root.data); // ab humara root node ka data print hoga. 
    }
}
