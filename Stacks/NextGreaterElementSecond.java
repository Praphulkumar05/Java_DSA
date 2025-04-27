import java.util.Stack;

public class NextGreaterElementSecond {
    public static int[] element(int arr[]) {
        int n = arr.length;
        int res[] = new int[n];
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        res[n - 1] = max;
        for (int j = n-2; j>=0; j--) {
            if (arr[j] > st.peek()) {
                res[j] = -1;
            } else {
                res[j] = st.peek();
            }
            st.push(arr[j]);

        }
       // System.out.println(st);
        return res;
       

    }

    public static void main(String[] args) {
        int arr[] ={1,3,-1,-3,5,3,6,7};
        int ans[] = element(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        // int largest=0;
        // int max = arr[0];
        // for(int i=1;i<arr.length;i++){
        // if(max<arr[i]){
        // max=arr[i];
        // }
        // }
        // System.out.println(max);

    }

}
