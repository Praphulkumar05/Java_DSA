public class delete_fuc {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class Lnked {
        Node head = null;
        Node tail = null;

        void inserts(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        void delete() { // Delete first node
            if (head == null) {
                System.out.println("List is empty.");
                return;
            }
            head = head.next;
            if (head == null) {
                tail = null;
            }
        }

        void deletAt(int idx) {
            if (idx == 0) {
                delete();
                return;
            }

            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                if (temp.next == null) {
                    System.out.println("Index out of bounds.");
                    return;
                }
                temp = temp.next;
            }

           

            if (temp.next.next == null) {
                tail = temp;
            }

            temp.next = temp.next.next;
        }

        void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(Stringggg[] args) {
        Lnked l = new Lnked();
        l.inserts(0);
        l.inserts(3);
        l.inserts(7);
        System.out.println("Before deleting:");
        l.print();
        l.deletAt(5); // Deleting the node at index 2
        System.out.println("After deleting at index 2:");
        l.print();
    }
}
