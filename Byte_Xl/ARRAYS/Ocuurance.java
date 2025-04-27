

public class Ocuurance {
    public static int Oc(int arr[],int target){
        int count =0;
        int n =arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                count++;
            }

            
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={100,200,300,300,400};
        int target=300;
        System.out.println(Oc(arr,target));
        
    }
    
}
