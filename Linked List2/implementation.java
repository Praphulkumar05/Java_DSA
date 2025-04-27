public class implementation {
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

        void insertAT(int idx,Node temp){
            Node n1 = new Node(10);
            for(int i=0;i<idx-1;i++){
                    n1=temp.next;
                        temp = n1;

            }

        }


        void inertATstart(int val){     //At start
            Node temp = new Node(val);
            if(head==null){
              inerstAtEnd(val);
            }else{
                temp.next=head;
            
            head=temp;
            }

        }




        void inerstAtEnd(int val) {   //At End

            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;

        }

        int length() {
            int count = 0;
            while (head != null) {
                count++;
                head = head.next;
            }
            return count;
        }
        void printt(Node head){                 //print int the reverse order.
            if(head==null)
             return;
            
            printt(head.next);
            System.out.println(head.val);
        

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
        Linked ll = new Linked();
        // ll.inerstAtEnd(1);
        // ll.inerstAtEnd(2);
        // ll.inerstAtEnd(3);
        // ll.inerstAtEnd(4);
        ll.inertATstart(6);
        ll.inertATstart(5);
        ll.inertATstart(4);
        ll.inertATstart(3);
        ll.inertATstart(2);
       ll.display();
       System.out.println();
       ll.insertAT(1, null);
       ll.display();
      // ll.printt(ll.head);
      
        // System.out.println();
        // System.out.println("Size of the List: " + ll.length());

    }

}
