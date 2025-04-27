import java.util.Stack;

public class MinimumElement {
    public static int  Mini(int arr[]){
        Stack<Integer> st = new Stack<>();
        int min =arr[0];
        st.push(arr[0]);
        for(int i=1;i<arr.length;i++){
            while(st.size()!=0&& arr[i]>st.peek()){
                st.pop();
              
            }
            // if(st.size()>0&& arr[i]<st.peek()){
            //     min=arr[i];
            // }
            if(arr[i]<min){
                min=arr[i];
            }
            st.push(arr[i]);
            

        }
       
       return min;
    }
    public static void main(String[] args) {
         int arr[]= { 6,3,-1,4,-2,0,5};
         int ans = Mini(arr);
         System.out.println("MINIMUM ELEMENT OF THE STACK: "+ans);  
        
    }
    
}
