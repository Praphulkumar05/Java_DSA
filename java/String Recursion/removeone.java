public class removeone {
    int ar(int arr[], int brr[], int size, int idx, int bidx) {
        if (idx == size) return bidx;
        if (arr[idx] != 1) {
            brr[bidx] = arr[idx];
            bidx++; 
        }
         return ar(arr, brr, size, idx + 1, bidx); 
    }

    void display(int brr[], int size, int idx) {
        if (idx == size) return;
        System.out.print(brr[idx] + " ");
        display(brr, size, idx + 1);
    }

    public static void main(String[] args) {
        int size = 4;
        int arr[] = {1, 24, 56, 1};
        int brr[] = new int[size]; 
        removeone p = new removeone();
        int result=p.ar(arr, brr, size, 0, 0);
         
        p.display(brr, result, 0);
    }
}
