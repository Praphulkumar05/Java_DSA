

public class AraayImplementationOfQueue {
    public static class Ai{
        int  f =-1;
        int r =-1;
        int size =0;
        int arr [] = new int[100];


        public  void Add(int val){
            if(r == arr.length-1){
                System.out.println("Queue is fulled");
                return;
            }
            if(f==-1){
                r=f=0;
                arr[0]= val;
            }
            else{
                arr[r+1]=val;
                r++;
            }  
            size++;                   
        }

        public int Remove(){
            if(size!=0){
                f++;
                size--;
            }
            
            return arr[f-1];
        }
        public int Top(){
            return arr[f] ;
        }

        public void display(){
            if(size==0){
                System.out.println("Queue is already empty");
            }
            for(int i =f;i<=r;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Ai a = new Ai();
        a.Add(1);
        a.Add(2);
        a.Add(3);
        a.Add(4);
        a.Add(5);
        a.display();
     a.Remove();
        a.display();
        System.out.println(a.Top());


        
    }
    
}
