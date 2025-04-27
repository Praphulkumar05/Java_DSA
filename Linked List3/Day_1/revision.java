public class revision {
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

        void insertAtSrt(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail=temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        void insertAtend(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail=temp ;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }
        void deleteHEad(){
            if(head==null){
                System.out.println("List is empty");
            }else{
                head=head.next;
            }
        

        }
        void deleteIdx(int idx){
            Node temp=head;
            if(idx==0){
                deleteHEad();
                return;
            }
            for(int i=0;i<idx-1;i++){
                if(temp.next==null){
                    System.out.println("idx is out of bound: ");
                }
                    temp=temp.next;
                
            }
            if(temp.next.next==null){
                tail=temp;
            }
            temp.next=temp.next.next;
        }
      void deleteVal(int val){                  ///delete by val..
        
        if(head==null){
            return;
        }
        if(head.val==val){
            head=head.next;
            return;
        }

        Node curt=head;
        while(curt.next!=null&curt.next.val!=val){
            curt=curt.next;
        }
        if(curt.next!=null){
            curt.next=curt.next.next;
        }
      }

        int size() {
            int cnt = 0;
            while (head != null) {
                cnt++;
                head = head.next;

            }
            return cnt;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Linked l = new Linked();
        l.insertAtSrt(1);          // 1->2->3->4->5->6->7
        l.insertAtSrt(2);
        l.insertAtSrt(3);
        //l.deleteHEad();
        l.display();
        System.out.println();
        l.deleteVal(3);
        
        l.display();
       

        
       
       


    }

}
