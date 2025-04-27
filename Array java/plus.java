import java.util.*;
public class plus {
    int sum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }

    void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    int ma(int arr[]){
        int ans=arr[0];
        int maxi=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>ans){
                ans=arr[i];
                maxi=i;
            }
        }
        return maxi;
    }

    int sch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) { // Loop through the entire array
            if (key == arr[i]) {
                return i; // Return index if the key is found
            }
        }
        return -1; // Return -1 if the key is not found
    }
    


    public static void main(Stringggg[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the arr: ");
        int size=sc.nextInt();
        System.out.println("Enter the elements");
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the key: ");
        int key=sc.nextInt();

            plus p= new plus();
            //System.out.println(p.sum(arr));
            //3p.print(arr);
           // System.out.println(p.ma(arr));
           System.out.println(p.sch(arr, key));
        
    }
}
