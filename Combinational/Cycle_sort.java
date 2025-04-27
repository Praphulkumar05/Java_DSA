public class Cycle_sort {
    public static int Sortt(int arr[],int n){
        // int i =0;                         //indx starts from 0 ;
        // while(i<n){
        //     int idx=arr[i];
        //     if(idx<n&&arr[i]!=i){
        //         int temp=arr[i];
        //         arr[i]=arr[idx];
        //         arr[idx]=temp;
        //     }else{
        //         i++;
        //     }
           

        // }
       

        

          int i =0;                         //indx starts from 1 ;
        while(i<n){
            int idx=arr[i]-1;
            // if(idx<n&&arr[i]!=i+1){
            if(arr[i]!=i+1&&arr[i]!=arr[idx]){
                int temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
            }else{
                i++;
            }
           
        }
        for(int j =0;j<n;j++){
            if(arr[j]!=j+1){
                return j+1;
            }
        }
         return n+1;
    }

    public static int Missing(int arr[],int n){       //Missing number......
        int i =0;                         
        while(i<n){
            int idx=arr[i];
            if(idx<n&&arr[i]!=i){
                int temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
            }else{
                i++;
            }
           

        }
        for(int j=0;j<n;j++){
            if(arr[j]!=j){
                return j;
            }

        }
        return n;

       

    }
 
      

    public static void main(String[] args) {
        int arr[]={-2,-1,0,1,2,4,5,6};
        System.out.println(Sortt(arr, arr.length));
       
        // // int ans []=Sortt(arr,arr.length);
        // // for(int i=0;i<ans.length;i++){
        // //     System.out.print(ans[i]+" ");
        // // }
        // System.out.println(Missing(arr, arr.length));


    }
    
}
