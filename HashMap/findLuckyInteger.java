import java.util.HashMap;

public class findLuckyInteger {
    public static int Lucky(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
      
        for(int i :arr){
            map.put(i,map.getOrDefault(i, 0)+1);

        }
        int findMax=-1;
        for(int ele:map.keySet()){
            if(ele==map.get(ele)){
               findMax =Math.max(findMax, ele);

            }
        }
        return findMax;


        



    }
    public static void main(String[] args) {
        int arr[]={2,2,2,3,3};
        System.out.println(Lucky(arr));
        
    }
    
}
