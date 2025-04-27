

public class seven {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int sum=0;
        int p=1;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                sum=sum+arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(i%2!=0){
                p=p*arr[i];
            }
        }
        System.out.println("Sum: "+ sum);
        System.out.println("Product: "+p);

    }
    
}
