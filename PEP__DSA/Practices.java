public class Practices {
    // public static void Cube(int n ,int m){
    //     if(m==0) return ;
    //     System.out.print(n*n*n+" ");
    //     Cube(n, m-1);
    // }


    public static void Sum(){
         int arr[] = { 2,3,4,5,6,7,8,9};
         int eSum=0;
         int ODdSum=0;
         int digitSum=0;
         for(int i=0;i<arr.length;i++){
            digitSum=digitSum+arr[i];

         }
         for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                eSum=eSum+arr[i];
            }else{
                ODdSum=ODdSum+arr[i];
            }
         }
         System.out.println("digit Sum : "+digitSum);
         System.out.println("Even Sum: "+eSum);
         System.out.println("Odd Sum: "+ODdSum);
    }
    public static int fact(int f){
        int fac=1;
        while(f>0){
            fac=fac*f;
            f--;
        }
        return fac;
        //System.out.println(fac);
    }


    public static boolean Strong(int num){
        int o = num;
        int sum=0;
        while(num>0){
            int digit= num%10;
            sum += fact(digit); 
            num=num/10;
        }
        return sum==o;

    }

    public static void main(Stringggg[] args) {
            // int n =2;
            // int m=3;
           // System.out.println(Math.pow(n, m));
            
        //    for(int i=0;i<1;i++){
        //         System.out.println(n*n*n);
        //    }
            //System.out.println(p);
          //  Cube(2, 3);
         // Sum();
        // fact(5);
        System.out.println(Strong(145));
        System.out.println(Strong(123));
    }
    
}
