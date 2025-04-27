public class critical {

    public static class Node{
        Node next;
        Node pre;
        int data;
        Node(int data){
            this.data = data;
            this.next=null;
            this.pre=null;

        }
        
    }

    public static class Linked{
        Node head;


      void insertfront(int data){
            
            Node newNode = new Node(data);
            if(head!=null){
                newNode.next=head;
                head.pre=newNode;

            }
            head=newNode;
        }




        void findcriticalpoint(){
            if(head==null||head.next==null||head.next.next==null){
                System.out.println("Empty list");
                return;
            }
            Node current = head.next;
            int pos=2;
            while(current.next!=null){
                if((current.data>current.pre.data&&current.data>current.next.data)||(current.data<current.pre.data&&current.data<current.next.data)){
                    System.out.println("Critical point: "+pos+" Value: "+current.data);
                }
                current=current.next;
                pos++;
            }
        }

        public void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(Stringggg[] args) {
        Linked l = new Linked();
        l.insertfront(10);
        l.insertfront(20);
        l.insertfront(5);
        l.insertfront(30);
        l.insertfront(15);
        l.display();
        l.findcriticalpoint();
      //  l.display();
        
    }
    
}
