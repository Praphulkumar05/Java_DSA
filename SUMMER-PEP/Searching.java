import java.util.Arrays;

public class Searching {
    public static int Search(int arr[], int k) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 13, 5, 245, 44, 5 };
        int k = 13;
        System.out.println(Search(arr, k));
       

    }

}
 