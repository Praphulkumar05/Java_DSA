public class Capacity_Storage {
    public static boolean check(int mid, int arr[], int days) {
        int n = arr.length;
        int count = 1;
        int m = mid;
        for (int i = 0; i < n; i++) {
            
            if (arr[i] <= m) {
                m -= arr[i];
            } else {
                //this count represents the next day...
                count++;
                m=mid-arr[i];
            }

        }
        if (count > days) {
            return false;
        } else {
            return true;
        }
    }

    public static int Ships(int arr[], int days) {
        int n = arr.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
             
            }
            sum += arr[i];

        }
        int lo = max;
        int hi = sum;
        int Capacity = sum;
        //normal binary srch..
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (check(mid, arr, days)) {
                Capacity = mid;
                hi = mid - 1;

            } else {
                lo = mid + 1;
            }
        }
        return Capacity;

    }

    public static void main(String[] args) {
        int arr[] = { 3,2,2,4,1,4};
        int days = 3;
        System.out.println(Ships(arr, days));

    }

}
