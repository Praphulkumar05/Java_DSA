// public class mer_sort {
//      int[] merge(int arr1[], int arr2[]) {
//         int n = arr1.length;
//         int m = arr2.length;

//         int arr3[]=new int[n+m];
//         int i = 0;
//         int j = 0;
//         int k = 0;
//         while (i <n && j < m) {
//             if (arr1[i] < arr2[j]) {
//                 arr3[k] = arr1[i];
//                 i++;
//                // k++;

//             } else {
//                 arr3[k] = arr2[j];
//                 k++;
//                 //j++;
//             }
//             k++;

//         }
//         // if (i == n) {
//         //     while (j <= m - 1) {
//         //         arr3[k] = arr2[j];
//         //         k++;
//         //         j++;
//         //     }
//         // }
//         // if (j == m) {
//         //     while (i <= n - 1) {
//         //         arr3[k] = arr1[i];
//         //         k++;
//         //         i++;
//         //     }
//         // }
//         while (i < n) {
//             arr3[k] = arr1[i];
//             i++;
//             k++;
//         }

//         // Copy remaining elements from arr2
//         while (j < m) {
//             arr3[k] = arr2[j];
//             j++;
//             k++;
//         }
           
        
//         return arr3;
//         }
//         void printArray(int arr[]) {
//             for (int i = 0; i < arr.length; i++) {
//                 System.out.print(arr[i] + " ");
//             }
//             System.out.println();

//     }

//     public static void main(String[] args) {
//         int arr1[] = { 1, 4, 5, 8 };
//         int arr2[] = { 2, 3, 6, 7, 10 };
//         //int arr3[] = new int[arr1.length + arr2.length];
//         mer_sort m=new mer_sort();
//         int []p= m.merge(arr1, arr2);
//         System.out.println("Merged arr");
//         m.printArray(p);
        
        

//     }

// }
public class mer_sort {
    // Merge two sorted arrays into a third array
    int[] merge(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;

        int arr3[] = new int[n + m];
        int i = 0;
        int j = 0;
        int k = 0;

        // Merge elements from both arrays in sorted order
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
            } else {
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from arr1
        while (i < n) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }

        // Copy remaining elements from arr2
        while (j < m) {
            arr3[k] = arr2[j];
            j++;
            k++;
        }

        return arr3;
    }

    // Print the elements of an array
    void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 4, 5, 8 };
        int arr2[] = { 2, 3, 6, 7, 10 };

        mer_sort m = new mer_sort();
        int[] mergedArray = m.merge(arr1, arr2);

        // Print the merged array
        System.out.print("Merged array: ");
        m.printArray(mergedArray);
    }
}

