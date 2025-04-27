public class Linearsrch{
    public static boolean srch(int arr[],int key){
        Boolean flag=false;
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                // flag true;
                return true;
            }
        }
        return flag;
        
    }


    public static void main(String[] args) {
        int arr[]={24,564,35,4,425,100};
        System.out.println(srch(arr, 10));
    }
}