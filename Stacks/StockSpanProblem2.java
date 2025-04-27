import java.util.Stack;

public class StockSpanProblem2 {
    public static int[] Span(int arr[]){
        Stack<Integer> st = new Stack<>();
        st.push(0);
        int res [] = new int[arr.length];
        res[0]=1;
        for(int i=1;i<arr.length;i++){
            while(st.size()!=0&& arr[i]>arr[st.peek()]){
                st.pop();
            }
            // if(arr[i]<arr[st.peek()]){
            //     res[i]=i-st.peek();
                
            // }
            if(st.size()==0){
                res[i]=i+1;
            }else{
                res[i]=i-st.peek();
            }
            st.push(i);

        }
        

       return res;
    }
    public static void main(String[] args) {
        int arr[]={ 80,100,60,70,60,75};
        int res[]= Span(arr);
        for(int i=0;i<res.length;i++){
            System.out.print (res[i]+" ");
        }
        
    }
    
}
