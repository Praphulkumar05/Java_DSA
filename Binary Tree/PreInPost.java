import java.util.LinkedList;
import java.util.Queue;

public class PreInPost {   //start the video from  2hr.
    public static class Node{
        int val;
        Node left;
        Node right;
        public  Node(int val){
            this.val = val;
        }
       
    }
    public static void PreOrder(Node root){    //Pre-Order
        if(root==null) return ;
        System.out.println(root.val);
        PreOrder(root.left);
        PreOrder(root.right);


    }
    public static void InOrder(Node root){   // In-Order//
        if(root==null) return;
        InOrder(root.left);
        System.out.println(root.val);
        InOrder(root.right);
    }
    public static void PostOrder(Node root){  // Post-Order..
        if(root==null) return ;
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.println(root.val);
    }
    public static void nthLevel(Node root ,int n){     //For printing the levels of tree, Basically any level.
        if(root==null) return;
        if(n==1){
            System.out.println(root.val);
            return;
        }
        nthLevel(root.left, n-1);
        nthLevel(root.right, n-1);
    }

    public static void bfs(Node root){   //for level order traversal....
        Queue<Node> q = new LinkedList<>();
        if(root!=null) q.add(root);
        while(q.size()!=0){
            Node temp = q.peek();
            if(temp.left!=null) q.add(temp.left);   
            if(temp.right!=null) q.add(temp.right);
            System.out.print(temp.val+" ");
            q.remove();
        }

    }
    

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left=a;
        root.right=b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left=c;
        a.right=d;
        Node e = new Node(6);
        Node f = new Node(7);
        b.left=e;
        b.right=f;
       // PreOrder(root);
       //InOrder(root);
       //PostOrder(root);
      // nthLevel(root, 4);.
     // bfs(root);
     nthLevel(root, 2);

       
        
    }
    
}
