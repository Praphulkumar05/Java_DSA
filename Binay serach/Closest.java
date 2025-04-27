import java.util.Arrays;

public class Closest {
    public static int[] CLosest(int arr[], int k, int x) {
        int n = arr.length;
        int brr[] = new int[k];

        //for checking the value on the 1st indx
        if (x < arr[0]) {
            for (int i = 0; i < k; i++) {
                brr[i] = arr[i];
            }
            return brr;


        }

        //for checking the last idx

        if (x >= arr[n - 1]) {
            for (int i = n - k; i < n; i++) {
                brr[i] = arr[i];

            }
            return brr;
        }

        //normal binary search....
        int lo = 0;
        int hi = n - 1;
        boolean flag = false;
        int idx = 0;
        int mid = -1;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if (arr[mid] == x) {
                flag = true;
                brr[idx] = arr[mid];
                idx++;
                break;
            } else if (arr[mid] > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        //checking for the upper and lower bound...
        int ub = lo;
        int lb = hi;
        if (flag == true) {
            lb = mid - 1;
            ub = mid + 1;
        }
        //checking and also filling the array...
        while (idx < k && lb >= 0 && ub <= n - 1) {
            int d1 = Math.abs(x - arr[lb]);
            int d2 = Math.abs(x - arr[ub]);
            if (d1 <= d2) {
                brr[idx] = arr[lb];

                lb--;
            } else {
                brr[idx] = arr[ub];

                ub++;
            }
            idx++;
        }

        //filling the oyher elements in the array..
        if (lb < 0) {
            while (idx < k) {
                brr[idx] = arr[ub];
                idx++;
                ub++;
            }
        }
        if (ub >= n - 1) {
            while (idx < k) {
                brr[idx] = arr[lb];
                idx++;
                lb--;
            }
        }

        //sorting the array.....
        Arrays.sort(brr);
        return brr;

    }

    public static void main(String[] args) {
        int arr[] = {1,1,2,3,4,5 };
        int k = 4;
        int x = -1;
        int brr[] = CLosest(arr, k, x);
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }

    }

}
