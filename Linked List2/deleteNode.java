public class deleteNode {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class List {
        Node head = null;
        Node tail = null;

        void inseerAtStart(int val) {
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
            if (tail == null) {
                tail = head;
            }

        }

        void deletePara(int val) {
            if (head == null) {
                System.out.println("List is empty: ");
                return;
            }
            if (head.val == val) {
                head = head.next;
                return;
            }
            Node temp = head;
            while (temp .next!= null && temp.next.val !=val) {
                temp = temp.next;

            }
            // if (temp.next == null) {
            //     System.out.println("Value not found in the list");
            //     return;
            // }
           // temp.val=temp.next.val;
            temp.next = temp.next.next;
            if (temp.next == null) {
                temp = tail;

            }

        }

        void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(Stringggg[] args) {
        List l = new List();
        l.inseerAtStart(1);
        l.inseerAtStart(2);
        l.inseerAtStart(3);
        l.inseerAtStart(4);
        l.inseerAtStart(5);
        l.inseerAtStart(6);
        l.print();
        System.out.println();
        l.deletePara(4);
        l.print();

    }

}
