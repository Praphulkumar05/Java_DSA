public class merger_three {
    void mergethree(int a1[], int a2[], int a3[]) {
        int i = 0;
        int j = 0;
        int k = 0;
        int p = 0;
        int m = a1.length;
        int n = a2.length;
        int w = a3.length;

        int a4[] = new int[m + n + w];

        // Merge all three arrays until one is exhausted
        while (i < m && j < n && k < w) {
            if (a1[i] <= a2[j] && a1[i] <= a3[k]) {
                a4[p] = a1[i];
                i++;
            } else if (a2[j] <= a1[i] && a2[j] <= a3[k]) {
                a4[p] = a2[j];
                j++;
            } else {
                a4[p] = a3[k];
                k++;
            }
            p++;
        }

        // Merge remaining elements of a1 and a2
        while (i < m && j < n) {
            if (a1[i] <= a2[j]) {
                a4[p] = a1[i];
                i++;
            } else {
                a4[p] = a2[j];
                j++;
            }
            p++;
        }

        // Merge remaining elements of a2 and a3
        while (j < n && k < w) {
            if (a2[j] <= a3[k]) {
                a4[p] = a2[j];
                j++;
            } else {
                a4[p] = a3[k];
                k++;
            }
            p++;
        }

        // Merge remaining elements of a1 and a3
        while (i < m && k < w) {
            if (a1[i] <= a3[k]) {
                a4[p] = a1[i];
                i++;
            } else {
                a4[p] = a3[k];
                k++;
            }
            p++;
        }

        // Merge remaining elements of a1, if any
        while (i < m) {
            a4[p] = a1[i];
            i++;
            p++;
        }

        // Merge remaining elements of a2, if any
        while (j < n) {
            a4[p] = a2[j];
            j++;
            p++;
        }

        // Merge remaining elements of a3, if any
        while (k < w) {
            a4[p] = a3[k];
            k++;
            p++;
        }

        // Print the merged array
        for (int ele : a4) {
            System.out.print(ele + " ");
        }
    }

    public static void main(String[] args) {
        int a1[] = { 1,2,3,4,5};
        int a2[] = { 1,2,3,4,5,6};
        int a3[] = { 1,2,3,4,5,6,7 };
        merger_three m = new merger_three();
        m.mergethree(a1, a2, a3);
    }
}
