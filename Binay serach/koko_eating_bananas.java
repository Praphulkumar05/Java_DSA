public class koko_eating_bananas {
    public static boolean check(int speed, int arr[], int h) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (count > h) {
                return false;
            }
            if (speed >= arr[i]) {
                count++;
            } else if (arr[i] % speed == 0)
                count += arr[i] / speed;
            else
                count += arr[i] / speed+ 1;

        }
        if (count > h) {
            return false;
        } else {
            return true;
        }
    }

    public static int eat(int arr[], int h) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int lo = 1;
        int hi = max;
        int ans = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (check(mid, arr, h)) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 7, 11 };
        int h = 8;
        System.out.println(eat(arr, h));

    }

}
