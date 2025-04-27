public class traversing {
    void display(int arr[],int size,int idx){
        if(idx==size)return;
        System.out.print(idx+ "");
        display(arr, size, idx+1);
    }
    public static void main(Stringggg[] args) {
        int size=4;
        int arr[]=new int[size];
        arr[0]=1;
        arr[1]=3;
        arr[2]=6;
        arr[3]=5;
        traversing p=new traversing();
        p.display(arr, size, 0);
     
       
        
    }
    
}
