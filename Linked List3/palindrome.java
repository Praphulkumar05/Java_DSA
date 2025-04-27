public class palindrome {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }

        public static Node DeppCopy(Node head) {
            Node curr = head;
            Node newNode = new Node(curr.val);
            head = newNode;
            Node CopyNode = newNode;
            curr = curr.next;
            while (curr != null) {
                CopyNode.next = new Node(curr.val);
                CopyNode = CopyNode.next;
                curr = curr.next;
            }
            return newNode;

        }

        public static Node R(Node head) {
            Node curr = head;
            Node forw = null;
            Node pre = null;
            while (curr != null) {
                forw = curr.next;
                curr.next = pre;
                pre = curr;
                curr = forw;

            }
            return pre;
        }

        public static boolean isPalindrome(Node head) {
            Node Reverselist = R(DeppCopy(head));
            Node temp1 = head;
            Node temp2 = Reverselist;
            // boolean flag = false;
            while (temp1 != null&&temp2!=null) {
                if (temp1.val != temp2.val) {
                  //  System.out.println("Is not palindrome: ");
                    return false;

                }
                
            
            temp1 = temp1.next;
            temp2 = temp2.next;
            }

          //  System.out.println("Is palindrome: ");
            return true;

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
        Node b = new Node(2);
        Node c = new Node(2);
        Node d = new Node(0);
        a.next = b;
        b.next = c;
        c.next = d;
        Node.print(a);
        // Node r = Node.DeppCopy(a);
        // Node.print(r);
        boolean p = Node.isPalindrome(a);
        System.out.println("Is the list is palindrome ?: " + p);

    }

}
