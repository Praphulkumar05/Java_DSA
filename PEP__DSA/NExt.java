public class NExt {
    public static int[] NextGreater(int arr1[], int arr2[]) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int result[] = new int[n1];
        boolean flag = false;
        for (int i = 0; i < n1; i++) {
            int found = -1;
            for (int j = 0; j < n2; j++) {
                if (arr2[j] == arr1[i]) {
                    flag = true;
                    for (int k = j + 1; k < n2; k++) {
                        if (arr2[k] > arr1[i]) {
                            found = arr2[k];
                            break;
                        }
                    }
                }
            }
            result[i] = found;

        }
        return result;

    }

    public static void main(String[] args) {
        int arr1[] = { 1, 4, 2 };
        int arr2[] = { 1, 3, 4, 2 };
        int fin[] = NextGreater(arr1, arr2);
        for (int i = 0; i < fin.length; i++) {
            System.out.print(fin[i] + " ");
        }

    }

}
