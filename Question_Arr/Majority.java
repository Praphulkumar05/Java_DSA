public class Majority {
    public static int major(int arr[]){
        int count =0;
        int candidate=0;
        int n =arr.length;
        for(int i =0;i<n;i++){
            if(count==0){
                candidate=arr[i];
            }
            if(arr[i]==candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};
        System.out.println(major(arr));
        
    }
    
}
