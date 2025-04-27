public class max_inx {

    static int maxidx(int arr[]) {
        int max = Integer.MIN_VALUE;
        int maxindx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxindx = i;
            }
        }
        return maxindx;
    }
    
    public static void main(Stringggg[] args) {
        int arr[] = {34 ,8 ,10 ,3, 2 ,80 ,30 ,33 ,1};
        max_inx o = new max_inx();
        int re = o.maxidx(arr);
        System.out.println(re);
    }
}
