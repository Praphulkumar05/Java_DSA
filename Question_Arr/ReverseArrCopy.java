

// public class ReverseArrCopy {
//     public static  int [] Copy(int arr[]){
//         int n = arr.length;
//         int brr[] = new int[n];
//         for(int i=0;i<arr.length;i++){
//             brr[i]=arr[n-i-1];
//         }
       
//          return brr;

//     }
//     public static void main(String[] args) {
//         int arr[] = { 1,2,3,4,5};
//         System.out.println("Original array: ");
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//         // Copy(arr);
//         System.out.println("Reversed Array and copying into other Brr: ");
//         int brr [] = Copy(arr);
//         for(int i=0;i<brr.length;i++){
//             System.out.print(brr[i]+" ");
//         }
//         System.out.println();
        
//     }
    
// }
 
// public class ReverseArrCopy {       //without using extra space,, or extra array.
//     public static void main(String[] args) {
        

//         int arr[] = {1,2,3,4,5};
//         int n = arr.length;
//         int p = 0;
//         int j = n-1;
//         while(p<=j){
//             int temp= arr[p];
//             arr[p]=arr[j];
//             arr[j]=temp;
//             p++;
//             j--;

//         }
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
        
//     }
// }
public class ReverseArrCopy {  
    public static int [] Re(int arr[]){
        int n = arr.length;
        int i = 1;
        int j =3;
        while(i<=j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;


    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int ans [] = Re(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
        
    }
}

