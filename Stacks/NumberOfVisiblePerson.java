import java.util.Stack;

public class NumberOfVisiblePerson {
    public static int [] Visible(int arr[]){
        int n= arr.length;
        Stack<Integer> st = new Stack<>();
        int ans [] = new int[n];
        st.push(n-1);
        ans[n-1]=0;
        for(int i =n-2;i>=0;i--){
            int count =0;
            while(st.size()!=0&&arr[i]>arr[st.peek()]){
                st.pop();        //we will count the number of pops happen..    that will be the number of person who are visible....
                count++;

            }
            if(st.size()!=0){
                count++;     // here it is mandatory to increase the count by 1 ...     that will be the number of person who are visible....
                
            }
            ans[i]=count;
            st.push(i);

        }
        return ans ;
    }
    public static void main(String[] args) {
        int arr[]={10,6,8,5,11,9};
        int pns[]=Visible(arr);
        for(int i=0;i<pns.length;i++){
            System.out.print(pns[i]+" ");;
        }
        
    }
    
}
