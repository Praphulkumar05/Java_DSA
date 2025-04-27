public class next_permutation {

    // static void reverse(int arr[], int i, int j) {
    // while (i < j) {
    // int temp = arr[i];
    // arr[i] = arr[j];
    // arr[j] = temp;
    // i++;
    // j--;
    // }
    // }

    // static void permu(int arr[]) {
    // int size = arr.length;
    // int idx = -1;

    // // Find the rightmost ascent
    // for (int i = size - 2; i >= 0; i--) {
    // if (arr[i] < arr[i+1]) {
    // idx = i;
    // break;
    // }
    // }

    // // If no ascent is found, reverse the array to get the smallest permutation
    // if (idx == -1) {
    // reverse(arr, 0, size - 1);
    // return;
    // }

    // // Find the rightmost element that is greater than arr[idx]
    // int j = -1;
    // for (int i = size-1; i>idx; i--) {
    // if (arr[i] > arr[idx]) {
    // j = i;
    // break;
    // }
    // }

    // // Swap the elements at idx and j
    // int temp = arr[idx];
    // arr[idx] = arr[j];
    // arr[j] = temp;

    // // Reverse the elements after idx
    // reverse(arr, idx + 1, size - 1);
    // }

    // public static void main(String[] args) {
    // int arr[] = {1,3,1};
    // permu(arr);

    // // Print the next permutation
    // for (int num : arr) {
    // System.out.print(num + " ");
    // }
    // }
    // }
    void reverse(int arr[], int i, int j) {
        int n = arr.length;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    void per(int arr[]) {
        int n = arr.length;
        int idx = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                idx = i;
                break;
            }
        }
        if(idx==-1){
            reverse(arr, 0, n-1);
        }

            int j=-1;
            for(int i=n-1;i>idx;i--){
                if(arr[i]>arr[idx]){
                    j=i;
                    break;
                }

            }
        int temp=arr[idx];
        arr[idx]=arr[j];
        arr[j]=temp;    
        reverse(arr, idx+1, n-1);
    }
    public static void main(String[] args) {
        int arr[]={1,3,1};
        next_permutation o= new next_permutation();
       o.per(arr);
       for(int t:arr){
        System.out.print(t+" ");
       }

    }

}
