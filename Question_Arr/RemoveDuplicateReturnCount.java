public class RemoveDuplicateReturnCount {
    public static int Count(int arr[]){
        int n = arr.length;
       
        int p=0;
        int c=1;
        
        for(int i =1;i<n;i++){
          if(arr[i]!=arr[p]){
            p++;
               
              arr[p]=arr[i];
              c++;
             
              

            }
        }
        for(int i =0;i<=p;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
       


      
        return c;
        
      


    }
    public static void main(String[] args) {

        int arr[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(Count(arr));
      
        
        
    }
    
}
