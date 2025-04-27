import java.util.*;

public class ee {
    public static void reverse(int arr[]){
        int i=0;
        int n=arr.length;
        int j = n-1;
        int temp;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

       
       
    }


    
   public static  void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,1,1};
        int size1=arr.length;
        int brr[]= new int[size1];
        for(int i=0;i<arr.length;i++){
            brr[i]=arr[i];
        }
        
        display(arr);
      
        
        // reverse(arr);
        // display(arr);
        

    }
    
}
