public class CircularQueueArrayImplemantation {
    public static class Circular{
        int f=-1;
        int r=-1;
        int size=0;
        int arr[] = new int[8];
        public void add(int val){
            if(size==arr.length){
                System.out.println("Queue is full: ");
            }
            else if (size==0){
                f=r=0;
                arr[0]=val;

            }else if (r<arr.length-1){
                arr[++r]= val;
            }else if (r==arr.length-1){
                r=0;
                arr[0]=val;

            }
            size++;
        }
        public void Remove(){
            if(size==0){
                System.out.println("Nothing to remove");
            }
            else{
                int v =arr[f];
                if(f==arr.length-1) f=0;
                else f++;
                System.out.println(v);
            }
            size--;

          
           
           
        }
        public void peek(){
            if(size==0){
                System.out.println("Queue is empty");
            }else {
                System.out.println(arr[f]);
            }
            
        }
        public void Display(){
            if(size==0){
                System.out.println("Queue is Empty");
            }
            else if (f<=r){
                for(int i=f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
            }else if (r<=f){
                for(int i = f;i<=arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i=0;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Circular c = new Circular();
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        c.Display();
        c.Remove();
        c.Display();
        
    }
    
}
