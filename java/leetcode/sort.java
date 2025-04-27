import java.util.Arrays;

public class sort {
    static void srt(int arr[]){
        Arrays.sort(arr);
    }
    public static void main(String[] args) {
        int arr[]={8,7,6,5,4,3,2,1};
       sort s=new sort();
        s.srt(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
    
}
