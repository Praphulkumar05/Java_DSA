
import java.util.*;

public class TargetSum {
    public static int Triple(int arr[],int k){
        int n = arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int e = j+1;e<n;e++){
                    if(arr[i]+arr[j]+arr[e]==k){
                        ans++;
                        System.out.println(" "+i+" "+j+" "+e);
                    }

                }
            }
        }
        return ans;
    }




    public static void Tar(int arr[], int target) {
        int ans = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    
                    // return new int[]{i,j};     /// This will print only the first idx
                    System.out.println(" "+i+" "+j);    // this will print the total idx of the target that is present in the array.

                }

            }

        }

        // return new int[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements"); 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target");
        int target = sc.nextInt();
        // Tar(arr, target);
        System.out.println(Triple(arr, target));
       
       
        // int ans [] = Tar(arr, target);
        // for(int i=0;i<ans.length;i++){
        //     System.out.print(ans[i]+" ");
        // }
        // System.out.println();

       

    }

}
