import java.util.*;

public class triplet {
    public static boolean target(int arr[], int sum) {
        // int n =arr.length;
        // for(int i =0;i<n;i++){
        // for(int j =i+1;j<n;j++){
        // for(int k = j+1;k<n;k++){
        // if(sum==arr[i]+arr[j]+arr[k]){
        // return true;
        // }

        // }

        // }
        // }
        // return false;
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
           
            while (left < right) {
                int curr = arr[i] + arr[left] + arr[right];
                if (sum == curr) {
                    return true;
                } else if (curr < sum) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 45, 6, 10, 8 };
        System.out.println(target(arr, 13));

    }

}
