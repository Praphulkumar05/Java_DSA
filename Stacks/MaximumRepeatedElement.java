import java.util.Stack;
import java.util.Arrays;;

public class MaximumRepeatedElement {

    public static int  Cpoy(int arr[]){
        Arrays.sort(arr);
        int n= arr.length;
        int maXCount =0;
        int CurrntCount =0;
        Stack<Integer> st = new Stack<>();
        int MaxEle=arr[0];
        for(int i=0;i<n;i++){
            if(st.size()!=0 && arr[i]==st.peek()){
                CurrntCount++;

            }
            else{
                if(CurrntCount>maXCount){
                    maXCount=CurrntCount;
                    MaxEle=st.peek();
                }
                st.push(arr[i]);
                CurrntCount=1;
            }


        }
        if(CurrntCount>maXCount){
            MaxEle=st.peek();
        }
        return MaxEle;

       
    }
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};
        int m = Cpoy(arr);
        System.out.println("Max element: "+m);
        
    }
    
}
