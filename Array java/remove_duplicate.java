public class remove_duplicate {
    static int removeDuplicate(int arr[]){
        int firstele=1;
        for(int i=1;i<arr.length;i++){
            // if(arr[i]!=arr[firstele-1]){
            //     arr[firstele]=arr[i];
            //     firstele++;
            if(arr[firstele-1]!=arr[i]){
                arr[firstele]=arr[i];
                firstele++;
                }
            }
            return firstele;
            
        }
      // return firstele;
    

   
    public static void main(Stringggg[] args) {
        int arr[]={9,9,8,5};
       int newSize = removeDuplicate(arr); 
       for(int i=0;i<newSize;i++){
        System.out.println(arr[i]+" ");
       }
       


        
    }
    
}
