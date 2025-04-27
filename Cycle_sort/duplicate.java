public class duplicate {
    public static int [] Repeat(int arr[]){
        int n =arr.length;
        int i =0;
        while(i<n){
            int idx=arr[i];
            if(idx<n&&arr[i]!=i){
                int temp =arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
            }else{
                i++;
            }
        }

        // for(int  j =0;j<n;j++){
        //     if(arr[j]==arr[j+1]){
        //         return arr[j];
        //     }
        // }
        // return n;
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,5,2};
        // System.out.println(Repeat(arr));
        int as[] = Repeat(arr);
        for(int i =0;i<as.length;i++){
            System.out.print(as[i]+" ");
        }
        
    }
    
}
