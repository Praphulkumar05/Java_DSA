public class merge_sort {
    public static void mergeSort(int arr[], int left, int right) {
        int mid = left+(right-left)/2;
        if (left < right) {
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            mergee(arr, left, mid, right);
        }
    }

    public static void mergee(int arr[], int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int Leftarray[] = new int[n1];
        int Rightarray[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            Leftarray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            Rightarray[j] = arr[mid + 1 + j];
        }
        int i = 0;
        int j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (Leftarray[i] <= Rightarray[j]) {
                arr[k] = Leftarray[i];
                i++;

            }
            else {
                arr[k] = Rightarray[j];
                j++;

            }
            k++;
        }
        while (i < n1) {
            arr[k] = Leftarray[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = Rightarray[j];
            j++;
            k++;
        }

    }

    public static void main(String[] args) {
        int arr[]={38,27,43,10};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        mergeSort(arr, 0, arr.length-1);
        System.out.println();

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
       

    }

}
// void merge(int a1[], int a2[],int a3[]) {
// int i = 0;
// int j = 0;
// int k = 0;
// int m = a1.length;
// int n = a2.length;
// a3 = new int[m + n];

// while (i < m && j < n) {
// if (a1[i] < a2[j]) {
// a3[k] = a1[i];
// i++;
// } else {
// a3[k] = a2[j];
// j++;
// }
// k++;
// }

// while (i < m) {
// a3[k] = a1[i];
// i++;
// k++;
// }

// while (j < n) {
// a3[k] = a2[j];
// j++;
// k++;
// }
// }
// void mergee(int arr[]){
// int n=arr.length;
// if(n==1) return;
// int n1=n/2;
// int n2=n-n/2;
// int brr[]=new int[n1];
// int crr[]=new int[n2];
// for(int i=0;i<n1;i++){
// brr[i]=arr[i];
// }
// for(int i=0;i<n2;i++){
// crr[i]=arr[i];
// }
// mergee(brr);
// mergee(crr);

// merge(brr, crr,arr);

// }
// void print(int arr[]){
// for(int i=0;i<arr.length;i++){
// System.out.println(arr[i]);
// }
// }

// public static void main(String[] args) {
// int arr[]={5,3,1,0,4,9,6};
// merge_sort p=new merge_sort();
// p.mergee(arr);
// p.print(arr);

// }

// }

// // public class MergeSort {
// // // Merges two subarrays of arr[].
// // void merge(int left[], int right[], int merged[]) {
// // int i = 0, j = 0, k = 0;
// // int m = left.length;
// // int n = right.length;

// // // Merge the two subarrays into merged[]
// // while (i < m && j < n) {
// // if (left[i] < right[j]) {
// // merged[k] = left[i];
// // i++;
// // } else {
// // merged[k] = right[j];
// // j++;
// // }
// // k++;
// // }

// // // Copy remaining elements of left[], if any
// // while (i < m) {
// // merged[k] = left[i];
// // i++;
// // k++;
// // }

// // // Copy remaining elements of right[], if any
// // while (j < n) {
// // merged[k] = right[j];
// // j++;
// // k++;
// // }
// // }

// // // Recursive merge sort function
// // void mergeSort(int arr[]) {
// // int n = arr.length;
// // if (n <= 1) {
// // return; // Base case
// // }

// // int mid = n / 2;
// // int left[] = new int[mid];
// // int right[] = new int[n - mid];

// // // Copy data to temporary arrays left[] and right[]
// // for (int i = 0; i < mid; i++) {
// // left[i] = arr[i];
// // }
// // for (int i = mid; i < n; i++) {
// // right[i - mid] = arr[i];
// // }

// // // Recursively sort the two halves
// // mergeSort(left);
// // mergeSort(right);

// // // Merge the sorted halves into arr
// // merge(left, right, arr);
// // }

// // // Utility function to print the array
// // void printArray(int arr[]) {
// // for (int i = 0; i < arr.length; i++) {
// // System.out.print(arr[i] + " ");
// // }
// // System.out.println();
// // }

// // public static void main(String[] args) {
// // int arr[] = {5, 3, 1, 0, 4, 9, 6};
// // MergeSort ms = new MergeSort();
// // ms.mergeSort(arr);
// // ms.printArray(arr);
// // }
// // }
