public class Qs {
    int part(int arr[], int si, int ei) {
        int pE = arr[(si + ei) / 2];
        int cnt = 0;
        for (int i = si; i <= ei; i++) {
            if (i == (si + ei) / 2)
                continue;
            if (arr[i] < pE) {
                cnt++;
            }
        }
        int pidx = cnt + si;
        int temp = arr[(si + ei) / 2];
        arr[(si + ei) / 2] = arr[pidx];
        arr[pidx] = temp;

        int i = si;
        int j = ei;

        while (i < pidx && j > pidx) {
            if (arr[i] <= pE)
                i++;
            if (arr[j] > pE)
                j--;
            else if (arr[i] > pE && arr[j] <= pE) {
                int swapt = arr[i];
                arr[i] = arr[j];
                arr[j] = swapt;
                i++;
                j--;
            }
        }
        return pidx;

    }

    void quk(int arr[], int si, int ei) {
      //  int n = arr.length;
        if (si >= ei)
            return;
        int pi = part(arr, si, ei);
        quk(arr, si, pi - 1);
        quk(arr, pi + 1, ei);
    }

    void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 9, 3, 8, 4, 2, 7, 6 };
        Qs e = new Qs();
        int n = arr.length;
        e.quk(arr, 0, n - 1);
        e.print(arr);

    }

}
