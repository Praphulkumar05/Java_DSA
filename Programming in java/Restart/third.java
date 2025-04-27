public class third {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        int temp=0;
        int n = arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
             temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int p=0;p<arr.length;p++){
            System.out.println(arr[p]);
        }
        // System.out.println(arr[temp]);
       // System.out.println(temp);
        
    }
    
}
