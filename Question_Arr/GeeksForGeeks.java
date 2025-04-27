public class GeeksForGeeks {
    public static int Largest(int arr[]){

    
        int n = arr.length;
        int l = Integer.MIN_VALUE;
        int secl = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            if(arr[i]>l){
                secl=l;
                l=arr[i];
            }else if (arr[i]>secl&&arr[i]!=1){
                secl=arr[i];
            }
        }
        return secl;
      
    }
    public static void main(String[] args) {

        int arr[]={10,10,10};
        System.out.println(Largest(arr));
        
    }
    
}
