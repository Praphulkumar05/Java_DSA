import java.util.*;
public class Array {

    public static int  largestNo(int arr[]){
    int n = arr.length;
    int l=arr[0];
    for(int i=1;i<n;i++){
        if(arr[i]<l){
            l=arr[i];

        }
       
    }
    return l;
    }
    public static void product(int arr[]){
        int pro=1;
        int sum=0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            pro=pro*arr[i];
            sum=sum+arr[i]; 

        
        }
        System.out.println("Product Will be: "+pro);
        System.out.println("Sum will be : "+sum);
    }

    public static void min(int arr[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println("Min is: "+min);
        System.out.println("Max: "+max);
        int temp=0;
        temp=min;
        min=max;
        max=temp;
        System.out.println("Min is: "+min);
        System.out.println("Max: "+max);
    
    }
  


     public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,5,6};
      min(arr);
       
        
       


        

        
       
    }
    
}


