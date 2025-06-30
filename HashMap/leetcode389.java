import java.util.HashMap;

public class leetcode389 {

    public static char find(String s ,String t){
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(char p  : s.toCharArray()){
            map1.put(p,map1.getOrDefault(p, 0)+1);
        }
        for(char a : t.toCharArray()){
           map2.put(a,map2.getOrDefault(a,0)+1);
        }

        for(char ch : map2.keySet()){
            if(!map1.containsKey(ch)||map2.get(ch)>map1.getOrDefault(ch, 0)){
                return ch;
            }


        }
    return'?';
    }

    

    public static void main(String[] args) {
        String  s = "abcd";
        String t = "abcde";
        System.out.println(find(s, t));
      
    }

}
