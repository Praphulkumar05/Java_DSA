public class second {
    public static void main(String[] args) {
        int arr[]= {1,2,4,0,6};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int sum;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];

            }
        }
        System.out.println(max);
        System.out.println(min);
        sum=max+min;
        System.out.println(sum);
    }
   
    
}
