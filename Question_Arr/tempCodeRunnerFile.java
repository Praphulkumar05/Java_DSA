public class MERGE {
    public static void Sort(int arr[], int brr[], int ans[]) {
        int s1 = arr.length;
        int s2 = brr.length;

        int left1 = 0;
        int left2 = 0;

        int idx = 0;
        while (left1 < s1 && left2 < s2) {
            if (arr[left1] < brr[left2]) {
                ans[idx] = arr[left1];
                idx++;
                left1++;
            } else {
                ans[idx] = brr[left2];
                idx++;
                left2++;

            }
        }
        while (left1 < s1) {
            ans[idx] = arr[left1];
            idx++;
            left1++;
        }
        while (left2 < s2) {
            ans[idx] = brr[left2];
            idx++;
            left2++;
        }

    }

    public static void m(int res[]) {
        int n = res.length;
        if (n == 1) {
            return;
        }
        int n1 = n / 2;
        int n2 = n - n / 2;
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            arr1[i] = res[i];
        }
        for (int i = 0; i < n2; i++) {
            arr2[i] = res[i + n1];
        }
        m(arr1);
        m(arr2);
        Sort(arr1, arr2, res);

    }

    public static void main(String[] args) {

        int arr[] = { 5, 3, 8, 6, 2, 7, 4, 1 };
        m(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

}
