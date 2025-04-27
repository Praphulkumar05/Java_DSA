
public class duplicate {
    static void duplicate(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.println(i);
            }
        }
    }
    public static void main(Stringggg[] args) {
        
        int arr[]={1,2,3,3,4};
        duplicate(arr);
    }
    
}
