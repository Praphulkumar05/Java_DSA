public class insert {

    public  static class Node{
        Node next;
        Node prev;
        int data;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }


    }

    public static class Imple{
        public Node head;

        public  void insertfront(int data){
            
            Node newNode = new Node(data);
            if(head!=null){
                newNode.next=head;
                head.prev=newNode;

            }
            head=newNode;
        }

        public void inseratend(int data){
            if(head==null){
                insertfront(data);
                return;

            }

            Node temp = head;
            while(temp.next!=null){
                temp=temp.next;

            }
            Node t = new Node(100);
            temp.next=t;
            t.prev=temp;


        }


        public void insertindx(int data ,int idx){
            Node s = head;
            for(int i=0;i<idx-1;i++){
                s=s.next;
            }
            Node r =s.next;
            Node t = new Node(data);
            s.next=t;
            t.prev=s;
            t.next=r;
            r.prev=t;

        }


        public void display(){
           Node temp =head;
           while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
           }
           System.out.println();
        }

    }
    public static void main(Stringggg[] args){

        Imple i = new Imple();
        i.insertfront(10);
        i.insertfront(20);
        i.insertfront(30);
        i.insertfront(40);
        i.display();
        i.inseratend(100);
        i.display();
        i.insertindx(1000, 2);
        i.display();

    }
    
}
