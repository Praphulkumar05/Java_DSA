public class balance {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;

        }
    
    }
    public static  int height(Node root){
        if(root==null) return 0;
        if(root.left==null&&root.right==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public static boolean ba(Node root){
        if(root==null) return true;
        int leftNode = height(root.left);
        if(root.left!=null) leftNode++;
        int rightNode = height(root.right);
        if(root.right!=null) rightNode++;
        int d = leftNode-rightNode;
        if(d<0) d=-d;
        if(d>1) return false;
        return ba(root.left)&&ba(root.right);

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
        a.right=d
        
    }
    
}
