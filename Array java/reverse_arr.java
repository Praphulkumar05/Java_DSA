public class reverse_arr {
    public static void main(Stringggg[] args) {
        int arr[]={43,53,35,24,64};
        int brr[]=new int[arr.length];
       
       for(int i=arr.length-2;i>=0;i--){
        brr[i]=arr[i];

        // System.out.println(arr[i]);
        System.out.println(brr[i]);
       }
    }
    
}
