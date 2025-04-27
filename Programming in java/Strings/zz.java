

public class zz {
    public static void main(String[] args) {
    //  StringBuilder str = new StringBuilder("hello");
    //  str.reverse();
    //  System.out.println(str);
    String str="aba";
    String ori=str;
    String gtr="";
    for(int i=str.length()-1;i>=0;i--){
       gtr+=str.charAt(i);
    }
  if(ori.equals(gtr)){
    System.out.println("Yes");
  }else{
    System.out.println("No");
  }


        
    }
    
}
