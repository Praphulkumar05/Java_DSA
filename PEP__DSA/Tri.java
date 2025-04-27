import java.util.*;
public class Tri {
    public static int Tribonnaci(int n){      //Tribonnaci series 
        if(n==0)return 0;
        if(n==1||n==2) return 1;
        return Tribonnaci(n-1)+Tribonnaci(n-2)+Tribonnaci(n-3);
    }


    public static void Natural(int n){    //N natural number
        int sum=0;
        
        while(n>0){
            sum=sum+n;
            

            n--;

        }
        System.out.println(sum);
    }


    public static void Fact(int fact){      ///Factorial
        int f=1;
        while(fact>0){
            f=fact*f;
            fact--;
        }
        System.out.println(f);
    }
    





    public static void main(Stringggg[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number");
        // int n = sc.nextInt();
        // for(int i=0;i<n;i++){
        //     System.out.print(Tribonnaci(i)+" ");

        // }
      // Natural(12);
       //Fact(5);
    //    int number= 12345;
    //    System.out.println("Reversed Number: ");
    //    while(number>0){
    //     int n = number  %10;
    //     System.out.print(n+" ");
    //    number=number/10;

    // }




    // int n=4;
    // int arr[]= new int[n];
    // arr[0]=1;
    // arr[1]=2;
    // arr[2]=3;
    // arr[3]=4;
    // for(int i=0;i<n;i++){
    //     System.out.print(arr[i]+" ");
    // }
    // System.out.println();
    // System.out.println("Reversed: ");
    // for(int i=n-1;i>=0;i--){
       
    //     System.out.print(arr[i]+" ");
    // }



    
    
    int brr[]= {1,2,2,1};
    int m= brr.length;
    int i=0;
    int j = m-1;
    boolean pali=true;
    while(i<=j){
        if(brr[i]!=brr[j]){
            pali = false;
        }
        i++;
        j--;
    }
    if(pali){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
      

        
        
    }
    
}
