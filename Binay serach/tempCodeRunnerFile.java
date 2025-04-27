public class Peek {
    public static boolean p(int m, int arr[]) {
        int n = arr.length;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i] && arr[j] > arr[j + 1]) {
                    m = j;
                    flag = true;
                }
            }
        }
        if (flag == true) {
            return true;

        } else {
            return false;
        }

    }

    public static int Peek(int arr[]) {
        int n = arr.length;
        int lo = 0;
        int hi = n - 1;
        int ans = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (p(ans, arr)) {
                ans = mid;
                hi = mid - 1;

            } else {
                lo = mid + 1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1 };
        System.out.println(Peek(arr));

    }
}
