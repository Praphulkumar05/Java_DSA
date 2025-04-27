public class diamterBT {
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
    public static int diameter(Node root){   
    if(root==null) return 0;
    if(root.left==null&&root.right==null) return 0;
    int leftNode =diameter(root.left);
    int rightNode = diameter(root.right);
    int mid = height(root.left)+height(root.right);
    if(root.left!=null) mid++;
    if(root.right!=null) mid++;
    // int max = Math.max(leftNode,Math.max(rightNode,mid));
    // return max;
    return Math.max(leftNode, Math.max(rightNode, mid));


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
        // Node e = new Node(6);
        // b.right =e;
        //System.out.println(height(root));
        System.out.println(diameter(root));
        
    }
    
}
