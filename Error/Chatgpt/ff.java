

public class ff {
    public static void Check(int arr[]){
        int n=arr.length;
        boolean flag = true;
        for(int i=0;i<n/2;i++){
            if(arr[i]!=arr[n-i-1]){
                flag=false;
                break;
            }
            
        }
        if(flag)System.out.println("Yes");
        else{
            System.out.println("No");
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,1,0};
        Check(arr);
        print(arr);


        
    }
    
}
