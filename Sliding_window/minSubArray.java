public class minSubArray {
    public static int min(int arr[], int target) {
        int n = arr.length;
        int left = 0;
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
//Main logic ...


        for (int right = 0; right < n; right++) {
            sum += arr[right];       //expanding the window...
            while (sum >= target) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;

                }
                sum -= arr[left];      //reducing the window for getting the minimum size
                left++;
            }
        }
        if (minLength == Integer.MAX_VALUE) {
            return 0;
        } else {
            return minLength;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1,1,1,1,1,1,1,1};
        int target = 11;
        System.out.println(min(arr, target));

    }

}
