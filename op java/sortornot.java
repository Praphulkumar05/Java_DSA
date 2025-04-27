public class sortornot {
    public static boolean sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
        if(arr[i]>arr[i+1]){
            return false;

        }
        
        }
        return true;
    }
    public static void main(Stringggg[] args) {
        int arr[]=new int[3];
        arr[0]=1;
        arr[1]=5;
        arr[2]=42;
        if(sort(arr)){
            System.out.println("arr is sorted");

        }else{
            System.out.println("Not sorted");
        }
        
    }
    
}
