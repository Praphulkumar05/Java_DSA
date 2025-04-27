

public class algo {
    public static int [] Sort(int arr[]){
        int n = arr.length;
        int i =0;
        while(i<n){
            int correctIdx=arr[i]-1;
            if(i==correctIdx) i++;
            else{
                int temp = arr[i];
                arr[i]=arr[correctIdx];
                arr[correctIdx]=temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {2,6,1,4,5,3,};
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int ans[] = Sort(arr);
        for(int i =0 ;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        
    }
    
}
