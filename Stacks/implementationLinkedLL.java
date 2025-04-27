public class implementationLinkedLL {
    public static class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;

        }
    }

    public static class LL{
       private  Node head;
        LL(Node head){
            this.head=null;
        }


        void push(int data){
            Node newNode = new Node(data);
            newNode.next=head;
            head=newNode;
            System.out.println(data+"   pushed in the stack: ");
            
        }

        int pop(){
            int top=head.data;
            head=head.next;
            return top;

        }
        int peek(){
            if(head==null){
                System.out.println("stack is empty: ");
                return -1;
            }else{
                return head.data;
            }
        }

        boolean isEmpty(){
        if(head==null){
            System.out.println("stack is empty: ");
            return true;

        }else{
            return false;
        }
    }

    public  void display(){
        Node temp = head;
        System.out.println("Stack is ready: ");
        while(temp!=null){
           
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

        
    }
}



    
        public static void main(String[] args) {
            LL l = new LL(null);
            l.push(10);
            l.push(20);
            l.push(30);
            l.push(40);
            l.display();
            System.out.println(l.pop());
            l.display();
            System.out.println(l.peek());

        
    }
    

}
