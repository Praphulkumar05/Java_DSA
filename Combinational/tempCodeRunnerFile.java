import java.util.Arrays;

public class sort {
    public static int[] Idx(int arr[], int target) {
        int n = arr.length;
        int sum = 0;
        int start = 0;
        for (int end = 1; end < n; end++) {
            sum += arr[end];
            while (sum > target && start <= end) {
                sum -= arr[start];
                start++;

            }
            if (sum == target) {
                return new int[] { start + 1, end + 1 };
            }
        }

        return new int[] { -1 };

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 7, 5 };
        int target = 12;
        int ans[] = Idx(arr, target);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }

}
