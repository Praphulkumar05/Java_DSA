public class bub {
    // void sort(int arr[]) {
    // int n = arr.length;
    // for (int i = 0; i < n - 1; i++) { //n-1 passes
    // for (int j = 0; j < n - 1 - i; j++) {
    // if (arr[j] > arr[j + 1]) {
    // int temp = arr[j];
    // arr[j] = arr[j + 1]; //swap
    // arr[j + 1] = temp;

    // }
    // // System.out.println(temp);
    // }
    // }

    // }

    // optimized bubble sort.
    void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag == true) {     //swap didn't haappen.
                break;
            }
        }

    }

    void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { -2, -4, -10, 4, -69 };
        bub b = new bub();
        // b.sort(arr);
        b.sort(arr);
        b.display(arr);

    }

}
