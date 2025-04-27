public class insertAtEnd {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

 

    public static class Linkedll {
        Node head = null;
        Node tail = null;






        void inserAteNd(int val) {          //insertAtend.
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                
            } else {
                tail.next = temp;

            }
            tail=temp;

        }





        void inserAteStrt(int val){         //insertAtstart.
            Node temp=new Node(val);
            if(head==null){
                head=temp;
            }else{
                temp.next=head;
            }
            head=temp;
        }
        void print(){
            Node tempp=head;
            while(tempp!=null){
                System.out.print(tempp.data+" ");
                tempp=tempp.next;
            }
        }

    }

    public static void main(Stringggg[] args) {
        Linkedll ll = new Linkedll();
        // ll.inserAteNd(2);
        // ll.inserAteNd(9);
        // ll.print();
        ll.inserAteStrt(1);
        ll.inserAteStrt(2);
        ll.print();

    }
}
