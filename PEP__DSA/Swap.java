

public class Swap {
    public static int Tri(int number){
        if(number==0) return 0;
        if(number==0||number==1) return 1;
        return  Tri(number-1)+Tri(number-2)+Tri(number-3);



    }
    public static void main(Stringggg[] args) {
        // int a=12;
        // int b=23;


        //First Method.


      
        //int temp;
        // temp=a;
        // a=b;
        // b=temp;
       
        //Second Method..

        // a=a+b;
        // b=a-b;
        // a=a-b;


        //Third Method.....

        // a = a*b;
        // b=a/b;
        // a=a/b;



        //Fourth Method.. (Bitwise)
       
        // a=a^b;
        // b=a^b;
        // a=a^b;

        // int number = 2;
        // int a=0;
        // int b=1;
        // for(int i=0;i<number;i++){
        //     int sum=a+b;
        //     System.out.print(sum+" ");
        //     a=b;
        //     b=sum;

        // }
        // System.out.println();
        int number=10;
        for(int i=0;i<number;i++){
            System.out.println(Tri(number)+" ");
        }










        
    }
    
}
