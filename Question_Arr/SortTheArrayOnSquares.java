public class SortTheArrayOnSquares {

    public static int[] Sq(int arr[]) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int idx = n - 1;

        int ans[] = new int[n];
        while (left <= right) {
            int leftsqr = arr[left] * arr[left];
            int rightsqr = arr[right] * arr[right];

            if (leftsqr > rightsqr) {
                ans[idx] = leftsqr;
                left++;
            } else   {
                ans[idx] = rightsqr;
                right--;

            }
            idx--;
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1,2,3,4};
        int ans[] = Sq(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();

    }

}
