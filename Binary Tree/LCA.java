

public class LCA {
    public static  class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;

        }
    }
    public static boolean contains(TreeNode root,TreeNode node){
        if(root==null){
            return false;
        }if(root==node){
            return true;
        }
        return contains(root.left,node)||contains(root.right,node);

    }
     public  static TreeNode lowest(TreeNode root, TreeNode p, TreeNode q) {
        if(p==root||q==root)return  root;
        if(p==q) return p;
        boolean leftp=contains(root.left,p);
        boolean rightq = contains(root.right,p);
        if(leftp==true&&rightq==true){
            return root;
        }
        if(leftp==true&&rightq==false){
            return lowest(root.left,p,q);
    

        }
        if(leftp==false&&rightq==true){
            return lowest(root.right,p,q);
        }
        if(leftp==false&&rightq==false){
            return root;
        }
        
    }
    public static void display(Node root){
        if(root==null) return ;
        System.out.print(root.val+"->");
        if(root.left!=null) System.out.print(root.left.val+" ");
        else if (root.left==null)System.out.print("Null"+",");
        if(root.right!=null) System.out.print(root.right.val+" ");
        else if (root.left==null)System.out.print("Null"+",");
        System.out.println();
        display(root.left);
        display(root.right);


        
    }
    
    public static void main(String[] args) {
        Node root = new Node(3);
        Node a = new Node(5);
        Node b = new Node(1);
        root.left=a;
        root.right=b;
        Node c = new Node(6);
        Node d = new Node(2);
        a.left=c;
        a.right=d;
        Node e = new Node(0);
        Node f = new Node(8);
        b.left=e;
        b.right=f;
        Node h = new Node(7);
        Node g = new Node(4);
        d.left=h;
        d.right=g;
        int p = 5;
        int q = 1;

        // display(root);
       System.out.println(lowest(root, p, q););

        
       


        
    }
    
}
