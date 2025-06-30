import java.util.*;
public class GoodNumbersOfPair {
    public static int Pair(int arr[]){
        //normal app.
        int Count=0;
        int n = arr.length;
        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                if(arr[i]==arr[j]&&i<j){
                    Count++;
                }

            }
        }
         return Count;
        // int count =0;
        // //Optimized app.

        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int ele:arr){
        //     count+=map.getOrDefault(ele, 0);
        //     map.put(ele,map.getOrDefault(ele, 0)+1);

        // }
        // return count ;
        

    }
    
    public static void main(String[] args) {
        int arr[]={1,1,1,1};
        System.out.println(Pair(arr));

        
    }
}
