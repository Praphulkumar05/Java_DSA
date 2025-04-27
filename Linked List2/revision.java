public class revision {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linked {
        Node head = null;
        Node tail = null;

        void insert(int data) {
            Node temp = new Node(data);
            temp.next = head;
            head = temp;

            // Update tail if it was null (i.e., first node inserted)
            if (tail == null) {
                tail = head;
            }
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

        void insertEd(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        void insertAny(int idx, int data) {
            if (idx < 0 || idx > size()) {
                System.out.println("Index out of bounds");
                return;
            }

            Node newNode = new Node(data);

            // Insert at the beginning
            if (idx == 0) {
                insert(data);
                return;
            }

            // Insert at the end
            if (idx == size()) {
                insertEd(data);
                return;
            }

            // Insert at any position in the middle
            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {  // Traverse to the node just before the target index
                temp = temp.next;
            }

            newNode.next = temp.next;  // Insert new node
            temp.next = newNode;
        }



        void delete(int idx){
            Node temp = head;
            if(idx==0){
                head=head.next;

            }
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            tail=temp;
           
            

        }
        int getELe(int idx){
            Node temp=head;
            for(int i=1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(Stringggg[] args) {
        linked l = new linked();
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(4);
        l.insert(0);

        // Inserting at index 5
       // l.insertAny(5, 100);
        l.display();
        System.out.println();
        l.delete(0);
        l.display();
        //System.out.println(tail.data);
        // System.out.println();
        // System.out.println(l.getELe(2));
    }
}
