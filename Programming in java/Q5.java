

public class Q5 {
    public static void main(Stringggg[] args) {
        int arr[]={1,0,5,0};
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[idx]=arr[i];
                idx++;
                }
            }
        while(idx<arr.length){
            arr[idx]=0;
            idx++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
