public class intersec {
    void ist(int val) {
        Node temp = new Node(val);
        if (temp == null) {
            head = tail = temp;

        } else {
            temp.next = head;
            head = temp;
        }
    }
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }

    }

    public static class Linked {
        Node head = null;
        Node tail = null;

        void ist(int val) {
            Node temp = new Node(val);
            if (temp == null) {
                head = tail = temp;

            } else {
                temp.next = head;
                head = temp;
            }
        }

        public static Node getIntersection(Node headA, Node headB) {
            Node tempA = headA;
            Node tempB = headB;
            int lenA = 0;
            while (tempA != null) {
                lenA++;
                tempA = tempA.next;
            }
            int lenB = 0;
            while (tempB != null) {
                lenB++;
                tempB = tempB.next;
            }
             tempA=headA;
             tempB= headB;
            if (lenA > lenB) {
                int a = lenA - lenB;
                for (int i = 1; i <= a; i++) {
                    tempA = tempA.next;
                }
            } else {
                int a = lenB - lenA;
                for (int i = 1; i <= a; i++) {
                    tempB = tempB.next;
                }
            }
            while (tempA != tempB) {
                tempA = tempA.next;
                tempB = tempB.next;

            }
            return tempA;


        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
        }

    }

    public static void main(Stringggg[] args) {
        // Linked l1 = new Linked();
        // l1.ist(10);
        // l1.ist(12);
        // l1.ist(5);
        // l1.ist(4);
        // l1.ist(3);
        // l1.ist(100);
        // l1.ist(87);
        // Linked l2 = new Linked();
        // l2.ist(10);
        // l2.ist(12);
        // l2.ist(5);
        // l2.ist(9);
        // l2.ist(90);
        // l1.display();
        // System.out.println();
        // l2.display();
        

    }

}
