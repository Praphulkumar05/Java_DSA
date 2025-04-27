public class DeleteMiddle {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }

        public static Node DeleteMid(Node head) {
            Node slow = head;                                       
            Node fast = head;
            if (head.next == null) {
                return null;
            }
            // while(fast!=null&&fast.next!=null&&fast.next.next!=null){
            //     slow=slow.next;
            //     fast=fast.next.next;

            // }
            // slow.val=slow.next.val;
            // slow.next=slow.next.next;
            // return head;
            while(fast.next.next!=null&&fast.next.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;
               
               
            }
            slow.next=slow.next.next;
            return head;
        }
         

        public static void print(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(Stringggg[] args) {
        Node a = new Node(2);
        Node b = new Node(1);
        Node c = new Node(10);   
        Node d = new Node(13);
       // Node e = new Node(12);
        a.next = b;
        b.next = c;
        c.next = d;
       // d.next = e;
        Node.print(a);
        Node a1 = Node.DeleteMid(a);
        Node.print(a1);

    }

}
