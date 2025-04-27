import java.util.Stack;

public class nextGreaterelement {

    public static int[] greaterelement(int arr[]){
        int n= arr.length;
        int res[] = new int[n];
        res[n-1]=-1;
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        
        for(int i=n-2;i>=0;i--){
            while(st.size()>0&&st.peek()<arr[i]){
                st.pop();
            }
            if(st.size()==0){
                res[i]=-1;
            }else{
                res[i]=st.peek();
            }
            st.push(arr[i]);
             //System.out.println("The stack is :"+st);      //to check  which elements are present.
            

        }
      
        return res;
      


    }
    public static void main(String[] args) {
        int arr[]={1,2,3,1,4,5};
        int res[]= greaterelement(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }

        
    }
    
}
