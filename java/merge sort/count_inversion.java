public class count_inversion {
    void inversion(int arr[]){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        System.out.println("Count is: "+count);
    }
    void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
        count_inversion c=new count_inversion();
        c.inversion(arr);
        //c.print(arr);
        
    }
    
}
