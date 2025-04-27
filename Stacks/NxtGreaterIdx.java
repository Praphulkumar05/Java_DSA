import java.util.Stack;

public class NxtGreaterIdx {
    public static Stack<Integer>  GreaterIndex(int arr[],int k){
        Stack<Integer> st = new Stack<>(); 
        int n= arr.length; 
        int res []  = new int[n]; 
        st.push(n-1);
        res[n-1]=n;
        for(int i =n-2;i>=0;i--){
            while(st.size()!=0 && arr[i]>=arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                res[i]=n;
            }else{
                res[i]=st.peek();
            }
            st.push(i);
        }
        Stack<Integer> ans = new Stack<>();
        int j=0;
        for(int i=0;i<n+k-1;i++){
            if(j<i){
                j=i;
            }
            int max = arr[j];
            while(j<i+k){
            max = arr[j];
            if(res[i]>=i+k) break;
            j=res[j];
            }
            ans.push(max);

        }
        return ans;

       
         
    
    
    }
    public static void main(String[] args) {
        int arr[]={8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
        Stack<Integer> p = new Stack<>();
        p= GreaterIndex(arr, 4);
        System.out.print(p+" ");
        
        
    }
    
}
x