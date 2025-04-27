
import java.util.*;
public class MAtrix {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int n=sc.nextInt();
        System.out.println("Enter the second size");
        int m=sc.nextInt();
        
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();

            }
        }
        System.out.println("Matrix: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }

        
    }
    
}
