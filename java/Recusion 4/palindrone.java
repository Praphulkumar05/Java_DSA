public class palindrone {
    // Boolean  palin(String s){             // This is itrative solution
    //     int i=0;
    //     int j=s.length()-1;
    //     while(i<j){
    //         if(s.charAt(i)!=s.charAt(j)){
              
               
    //             return false;

    //         }
    //         i++;
    //         j--;
    //     }
    //     return true;
    // }

    // this is recursive solution.
    Boolean palind( String s ,int i,int j){
        if(i>j) return true;
        if(s.charAt(i)!=s.charAt(j))return false;
        else return palind(  s , i+1,j-1);
    }

    public static void main(String[] args) {
        String s="racecar";
        palindrone p=new palindrone();
    //    System.out.println(p.palin(s));
    System.out.println(p.palind(s, 0, s.length()-1));
        
    }

    
}
