public class SelectionSort {
    
    public static void SelectionSorT(int arr[]){
        int n = arr.length;
       
        for(int i =0;i<n-1;i++){
            int min =i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                  
                }
            }
            if(min!=i){
                int temp = arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
         
        }
        for(int  h =0;h<n;h++){
            System.out.print(arr[h]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={323,542,1,2};
        SelectionSorT(arr);
        
    }
    
}
