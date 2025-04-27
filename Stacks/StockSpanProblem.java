import java.util.Stack;

public class StockSpanProblem {
    public static int[] Span(int arr[]){
        int n=arr.length;
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        ans[0]=1;
        for(int i=1;i<n;i++){
            while(st.size()>0&&arr[st.peek()]<=arr[i] ){
                st.pop();
            }
            if(st.size()>0){
                ans[i]=i-st.peek();
            }
            st.push(i);
            
            }
        
        
        return ans;

        
    }
    public static void main(String[] args) {
        int arr[]= {100,80,60,70,60,75,85};
        int ans[] = Span(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        
        
    }

    
}
