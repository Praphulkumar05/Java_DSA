public class sizeHeightMax {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }

    }


    public static int Max(Node root){
        if(root==null) return Integer.MIN_VALUE;   //Max node or leaf of the tree...
        int a = root.val;
        int b = Max(root.left);
        int c =Max(root.right);
        return Math.max(a,Math.max(b, c));
        
    }
    public static int Sum(Node root){     //Sum of the tree
            if(root==null) return 0;
        return  root.val+Sum(root.left)+Sum(root.right);

    }
    public static int Size(Node root){   //Calculating the size.....
        if(root==null) return 0;
        return 1+ Size(root.left)+Size(root.right);
    }
    public static void PreOrder(Node root){
        if(root==null) return ;
        if(root.left==null&&root.right==null) return;
            System.out.print(root.val+" ");
            PreOrder(root.left);
            PreOrder(root.right);
    }

    public static int height(Node root){
        if(root==null) return 0;
        if(root.left==null&&root.right==null) return 0;
       return 1+Math.max(height(root.left),height(root.right));
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
        b.right =e;
       // PreOrder(root);
    //    System.out.println(Size(root));
    //    System.out.println(Sum(root));
    //    System.out.println(Max(root));
    //    System.out.println(height(root));
       PreOrder(root);

    }

}
