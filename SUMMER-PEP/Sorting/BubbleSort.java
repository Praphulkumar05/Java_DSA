

public class BubbleSort {
    public static void Bubble(int arr[]){
        int n =arr.length;
       
        for(int i =0;i<n;i++){
             boolean flag = false;/// optimized
            for(int j =0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;

                }
            }
            if(!flag){
               break;
            }
        }
        
        for(int h =0;h<n;h++){
        System.out.print(arr[h]+" ");
        }
       
    }
    public static void main(String[] args) {
        int arr[]={324,25,65,254,1,34};
       Bubble(arr);
        
    }
    
}
