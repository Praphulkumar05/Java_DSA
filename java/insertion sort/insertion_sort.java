public class insertion_sort {
    void insert(int a[]) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j >= 1 && a[j] < a[j - 1]) {
                int temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;
                j--;
            }
        }
    }

    void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {

        int a[] = { 5,4,3,2,1};
        insertion_sort i = new insertion_sort();
        i.insert(a);
        i.print(a);
    }

}
