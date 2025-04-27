import java.util.Arrays;
public class reverse {
    public static void re(int arr[]){
        int n=arr.length;
        int srt=0;
        int temp=0;
        int end=n-1;
        while(srt<end){
            temp=arr[srt];
            arr[srt]=arr[end];
            arr[end]=temp;
            
            srt++;
            end--;
        }
      

    }
  
   
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
      re(arr);
      System.out.println(Arrays.toString(arr));
      //display(arr);
        
    }
}
