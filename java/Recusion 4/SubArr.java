public class SubArr {
    void sarr(int arr[], int idx, String subarr) {
        if (idx == arr.length) {
            System.out.println(subarr);
            return;
        }
        
        // Recur without including the current element
        sarr(arr, idx + 1, subarr);
        
        // Recur including the current element
        sarr(arr, idx + 1, subarr + (subarr.isEmpty() ? "" : " ") + arr[idx]);
    }
 
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        SubArr pk = new SubArr();
        pk.sarr(arr, 0, "");
    }
 }
 