public class mergesort {
    // Merges two subarrays of err[].
    void merge(int arr[], int brr[], int crr[]) {
        int i = 0, j = 0, k = 0;
        int m = arr.length;
        int n = brr.length;
        
        // Merge the two subarrays into crr[]
        while (i < m && j < n) {
            if (arr[i] < brr[j]) {
                crr[k] = arr[i];
                i++;
            } else {
                crr[k] = brr[j];
                j++;
            }
            k++;
        }
        
        // Copy remaining elements of arr[], if any
        while (i < m) {
            crr[k] = arr[i];
            i++;
            k++;
        }
        
        // Copy remaining elements of brr[], if any
        while (j < n) {
            crr[k] = brr[j];
            j++;
            k++;
        }
    }

    // Recursive merge sort function
    void mergSort(int err[]) {
        int n = err.length;
        if (n <= 1) {
            return; // Base case
        }
        
        int n1 = n / 2;
        int n2 = n - n1;
        int arr[] = new int[n1];
        int brr[] = new int[n2];
        
        // Copy data to temporary arrays arr[] and brr[]
        for (int i = 0; i < n1; i++) {
            arr[i] = err[i];
        }
        for (int i = 0; i < n2; i++) {
            brr[i] = err[i + n1];
        }
        
        // Recursively sort the two halves
        mergSort(arr);
        mergSort(brr);
        
        // Merge the sorted halves into err
        merge(arr, brr, err);
    }

    // Utility function to print the array
    void print(int ree[]) {
        for (int i = 0; i < ree.length; i++) {
            System.out.print(ree[i]+" ");
        }
    }

    public static void main(String[] args) {
        int err[] = {5, 3, 1, 0, 4, 9, 6};
        mergesort o = new mergesort();
        o.mergSort(err);
        o.print(err);
    }
}
