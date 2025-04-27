public class uppercase {
    public  static int sort(int arr[]){
        int n=arr.length;
        boolean flag =false;
        for(int i=0;i<n-1;i++){
          
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            
        }
        if(flag==true){
            return 1;
        }else{
            return 0;
        }
        
    }

    public static void reverse(int arr[]){
        for(int i=arr.length-1;i>0;i--){
            System.out.println(arr[i]);
        }
    }
    public static void main(Stringggg[] args) {
        int arr[]=new int[5];
        arr[0]=12;
        arr[1]=2;
        arr[2]=1;
        arr[3]=125;
        arr[4]=199;
        System.out.println("Unsorted arr");

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
        System.out.println("Sorted array");
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        // }
        // System.out.println("Reverse");
        // reverse(arr);
       
        }
        
       
    }
    
}
