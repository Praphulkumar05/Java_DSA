public class next_permutation{
    public static void re(int arr[],int i ,int j){
        while(i<=j){
            int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;

        }
        
    }
    public static int [] next(int arr[]){
        int n =arr.length;
        int left =n-2;
        int right =n-1;
        while(left>=0&&arr[left]>arr[left+1]){
            left--;
            
        }
       
        while(arr[left]>arr[right]){
            right--;
        }
        
        int temp =arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
       
        re(arr,left+1,n-1);
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={3,2,1};
        int ans[]= next(arr);
        for(int i =0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        
    }
}