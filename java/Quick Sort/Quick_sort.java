public class Quick_sort {
    int parition(int arr[], int si, int ei) {
        int piovtElement = arr[(si + ei) / 2];
        // int piovtElement=arr[si];
        int count = 0;
        for (int i = si; i <= ei; i++) {
            if (i == (si + ei) / 2)
                continue;
            if (arr[i] < piovtElement)
                count++;
        }
        int pivotIdx = count + si;
        int temp = arr[(si + ei) / 2];
        arr[(si + ei) / 2] = arr[pivotIdx];
        arr[pivotIdx] = temp;



        int i = si;
        int j = ei;
        while (i < pivotIdx && j > pivotIdx) {
            if (arr[i] <= piovtElement)
                i++;
            if (arr[j] > piovtElement)
                j--;
            else if (arr[i] >= piovtElement && arr[j] <= piovtElement) {
                int tempp = arr[i];
                arr[i] = arr[j];
                arr[j] = tempp;
                i++;
                j--;
            }

        }
        return pivotIdx;
    }

    void qck(int arr[], int si, int ei) {
        int n = arr.length;
        if (si >= ei)
            return;
        int pi = parition(arr, si, ei);
        qck(arr, si, pi - 1);
        qck(arr, pi + 1, ei);
    }

    void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
           int arr[]={ 9,3,8,4,2,7,6};
        int n = arr.length;
        Quick_sort q = new Quick_sort();
        q.qck(arr, 0, n - 1);
        q.print(arr);

    }

}
