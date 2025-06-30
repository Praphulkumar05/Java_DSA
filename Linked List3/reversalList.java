public class reversalList {

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }

        public static Node Rev(Node head) {
            if (head.next == null)
                return head;
            Node nn = Rev(head.next);
            head.next.next = head;
            head.next=null;
            return nn;
        }
        public static Node R(Node head){
            Node curr=head;
            Node pre=null;
            Node forward=null;
            while(curr!=null){
                forward=curr.next;
                curr.next=pre;
                pre=curr;
                curr=forward;
            }
            return pre;

        }


        public static Node Deep(Node head){
            Node curr=head;
            Node neWNode = new Node(curr.val);
            head=neWNode;
            Node CopyNode = neWNode;
            curr=curr.next;
            while(curr!=null){
                CopyNode.next=new Node(curr.val);
                CopyNode=CopyNode.next;
                curr=curr.next;
            }
            return neWNode;


        }

        public static void print(Node head) {
            if (head == null) {
                System.out.println();
                return;
            }
             System.out.print(head.val+" ");
            print(head.next);
           // System.out.println(head.val + " ");

        }
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(2);
        Node e = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        Node.print(a);
      //  Node p = Node.Rev(a);
      Node r = Node.R(a);
    //    Node.print(a);
       Node.print(r);
            // Node n  = Node.Deep(a);
            // Node.print(n);
        
        

    }
}
