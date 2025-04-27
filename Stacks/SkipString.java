import java.util.Stack;

public class SkipString {
    public static int Skip(String [] str){
        int n = str.length;
        int sum=0;
        Stack <Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            if(str[i].matches( "-?\\d+")){
                int num =Integer.parseInt(str[i]);
                st.push(num);
            }
             else if(str[i]=="C"){
                st.pop();
            }
             else if(str[i]=="D"){
                st.push(st.peek()*2);
            }
          
             else if(str[i]=="+"){
                int p = st.pop();
                int r = st.peek();
                st.push(p);
                st.push(p+r);
              
            }

        
        }
       while(st.size()!=0){
        sum = sum+st.pop();

       }
       return sum;
    }
    
    public static void main(String[] args) {
       
    //  String str[] = {"5", "2", "C", "D", "+"};
    String str[] = {"5","2","C","D","+"};
   System.out.println(Skip(str));
        // for (int i = 0; i < str.length; i++) {
          
        //     if (str[i].matches("-?\\d+")) {
        //         int num = Integer.parseInt(str[i]);
        //         System.out.println("Converted: " + num);
        //     } else {
        //         System.out.println("Skipped: " + str[i]);
        //     }
        // }
    //     Stack <Integer> st = new Stack<>();
    //     st.push(5);
    //     st.push(2);
    //    // st.pop();
    //     for(int i=0;i<st.size();i++){
    //         int p = st.pop();
    //         //st.push(p*2);
    //     }
    //     System.out.println(st.push(st.peek()*2));
    }
}
