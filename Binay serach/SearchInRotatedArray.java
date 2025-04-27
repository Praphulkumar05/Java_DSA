public class SearchInRotatedArray {
    public static int idx(int arr[], int target) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        if (n == 1) { 
            if (arr[0] == target) { 
                return 0; 
            } else { 
                return -1; 
            } 
        }
        
        int pivot = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid == 0) {
                low = mid + 1;
            } else if (mid == n - 1) {
                high = mid - 1;
            }
            if (arr[mid] < arr[mid + 1] && arr[mid] < arr[mid - 1]) {
                pivot = mid;
                break;

            } else if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                pivot = mid + 1;
                break;

            } else if (arr[mid] > arr[high]) {
               low=mid+1;
            } else {
               high=mid-1;
            }
        }
        if (pivot == -1) {
            low = 0;
            high = n - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (arr[mid] == target) {
                    return mid;

                } else if (arr[mid] < target) {
                  low=mid+1;

                } else {
                   high=mid-1;
                }
            }
            return -1;

        }
        if (target >= arr[0] && target <= arr[pivot - 1]) {
            low = 0;
            high = pivot - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (arr[mid] == target) {
                    return mid;

                } else if (arr[mid] < target) {
                   low=mid+1;

                } else {
                   high=mid-1;
                }
            }
        } else {
            low = pivot;
            high = n - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (arr[mid] == target) {
                    return mid;

                } else if (arr[mid] < target) {
                   low=mid+1;

                } else {
                   high=mid-1;
                }
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int arr[] = {1,3};
        int target = 0;
        System.out.println(idx(arr, target));

    }

}
