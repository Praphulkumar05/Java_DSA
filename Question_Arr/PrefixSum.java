public class PrefixSum {
    // public static int[] Pre1(int arr[]) {
    //     int n = arr.length;
    //     int preFix[] = new int[n];     //here we are using extra array for storing the value
    //     preFix[0] = arr[0];
    //     for (int i = 1; i < n; i++) {
    //         preFix[i] = preFix[i - 1] + arr[i];
    //     }
    //     return preFix;

    // }
    public static int [] Pre2(int arr[]){
        int n =arr.length;
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];

        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 3, 4, 5 };
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int preFix[] = Pre2(arr);
        for (int i = 0; i < preFix.length; i++) {
            System.out.print(preFix[i] + " ");
        }
        System.out.println();

    }

}
