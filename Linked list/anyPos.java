public class anyPos {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class Linkedd {
        Node head = null;
        Node tail = null;

        void insertS(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp; // initialize tail as well when the first node is added
            } else {
                temp.next = head;
                head = temp;
            }
        }

        void inseerE(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp; // initialize tail as well when the first node is added
            } else {
                tail.next = temp;
                tail = temp; // update tail to the new node
            }
        }

        void insertPo(int idx, int val) {
            if (idx == 0) {
                insertS(val);
                return;
            }

            if (idx == size()) {
                inseerE(val);
                return;
            }

            Node node1 = new Node(val);
            Node temp = head;
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }
            node1.next = temp.next;
            temp.next = node1;
        }

        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        void display() {
            Node temp = head; // use a temporary pointer to traverse the list
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println(); // move to the next line after displaying all elements
        }
    }

    public static void main(Stringggg[] args) {
        Linkedd d = new Linkedd();
        d.insertS(5);
        d.insertS(4);
        d.insertS(3);
        d.insertS(2);
        d.insertS(1);
        System.out.println("Before insert:");
        d.display();
        d.insertPo(2, 6);
        System.out.println("After insert:");
        d.display();
    }
}
