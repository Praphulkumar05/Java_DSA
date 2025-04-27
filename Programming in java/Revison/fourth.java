

public class fourth {
    public static void main(String[] args) {
        int arr[]={1,1};
        int orr[]=new int[arr.length];        
       for(int i=0;i<arr.length;i++){
        orr[i]=arr[i];
       }
       int i=0;
       int j=arr.length-1;
       int temp=0;
       while(i<j){
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
        
       }
    //    for(int p=0;p<arr.length;p++){
    //     System.out.print(arr[p]+" ");
    //    }
    if(orr[i]==arr[i]){
        System.out.println("Yes palindron ");
    }else{
        System.out.println("No");
    }
      
        }
    
}
