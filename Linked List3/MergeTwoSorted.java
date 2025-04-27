public class MergeTwoSorted {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;

        }

        public static Node Merge(Node head1, Node head2) { //// using extra space.....
            Node temp1 = head1;
            Node temp2 = head2;
            Node head = new Node(100);
            Node temp = head;
            if (temp1 == null)
                return temp2;
            if (temp2 == null)
                return temp1;
            while (temp1 != null && temp2 != null) {
                if (temp1.val < temp2.val) {
                    Node p = new Node(temp1.val);
                    temp.next = p;
                    temp = p;
                    temp1 = temp1.next;

                } else {
                    Node p = new Node(temp2.val);
                    temp.next = p;
                    temp = p;
                    temp2 = temp2.next;

                }
                if (temp1 == null) {
                    temp.next = temp2;
                } else {
                    temp.next = temp1;
                }
            }
            return head.next;

        }

        public static Node MErge(Node head1, Node head2) { // Without using extra space....
            Node t1 = head1;
            Node t2 = head2;
            Node head = new Node(100);
            Node temp = head;
            if (t1 == null)
                return t2;
            if (t2 == null)
                return t1;
            while (t1 != null && t2 != null) {
                if (t1.val < t2.val) {
                    temp.next = t1;
                    temp = t1;
                    t1 = t1.next;
                } else {
                    temp.next = t2;
                    temp = t2;
                    t2 = t2.next;
                }
                if (t1 == null) {
                    temp.next = t2;
                } else {
                    temp.next = t1;
                }

            }
            return head.next;

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
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(5);
        Node d = new Node(8);
        Node e = new Node(9);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        a.print(a);

        Node a1 = new Node(2);
        Node b1 = new Node(4);
        Node c1 = new Node(6);
        Node d1 = new Node(7);
        a1.next = b1;
        b1.next = c1;
        c1.next = d1;
        a1.print(a1);
        // Node merge = Node.Merge(a, a1);
        // Node.print(merge);
        Node mm = Node.MErge(a, a1);
        Node.print(mm);

    }

}
