public class aum_arr {
    void sum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum: "+sum);

    }
    void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(Stringggg[] args) {
        int arr[]={1,2,3,4};
        aum_arr p=new aum_arr();
        p.sum(arr);
        //p.print(arr);
        
        
    }
    
}
