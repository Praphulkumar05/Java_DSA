public class EvenOddValues {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
        public static Node evenNodd(Node head){
            // Node todd=head;
            // Node teven=head;
            Node t = head;
           Node EvenDummy= new Node(100);
           Node OddDummy = new Node(100);
           Node eVen= EvenDummy;
           Node OdD= OddDummy;
           
            while(t!=null){
                if(t.val%2==0){
                  eVen.next=new Node(t.val);
                  eVen=eVen.next;
                }else{
                  OdD.next=new Node(t.val);
                  OdD=OdD.next;
                     
                }
                t=t.next;
               
               
                
            }
            // eVen.next=OddDummy.next;
            // return EvenDummy.next;
            OdD.next=EvenDummy.next;
            return OddDummy.next;
           


        }



        
        public static void print(Node head){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;


            }
            System.out.println();
        }
    }
    public static void main(Stringggg[] args) {
        Node a = new Node(2);
        Node b = new Node(1);
        Node c = new Node(3);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(4);
        Node h = new Node(7);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=h;
        Node.print(a);
        Node q = Node.evenNodd(a);
        Node.print(q);


        
        
    }
    
}
