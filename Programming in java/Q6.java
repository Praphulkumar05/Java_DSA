

public class Q6 {
    public static void main(Stringggg[] args) {
        int arr[]={1,0,1,0};
        int  n= arr.length;
        int indx=n-1;
        for(int i= n-1;i>=0;i--){
            if(arr[i]!=0){
                arr[indx]=arr[i];
                indx--;
            }

        }
        while(indx>=0){
            arr[indx]=0;
            indx--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
