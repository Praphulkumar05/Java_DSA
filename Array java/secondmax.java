

public class secondmax {
    static void secmax(int arr[]){
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i])max=arr[i];
            
        }
   System.out.println("First largest is: "+max);

        for(int j=0;j<arr.length;j++){
            if(smax<arr[j] &&max!=arr[j])smax=arr[j];
            
        }
        System.out.println("Second largest element is: "+smax);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
       secmax(arr);
        
    }
    
}
