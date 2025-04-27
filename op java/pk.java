import java.util.*;

public class pk {

    static int max(int arr[],int n){
        int max =arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;

    }
    public void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        //System.out.println("Elements are: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }


        System.out.println(max(arr, n));
       
        

        
    }
    
}
