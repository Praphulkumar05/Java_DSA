public class sort_without_changing_order {
    void srt(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]==0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                
            }
            
            
        }
    }
    void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,0,1,2,0,0,4,0,3};
        sort_without_changing_order s=new sort_without_changing_order();
        s.srt(arr);
        s.print(arr);
        
    }
    
}
