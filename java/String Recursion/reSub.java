// with repetation of the same string
public class reSub{
    void sub(String ans,String ori,int ind ,Boolean flag){
        
        if(ind==ori.length()){

            System.out.println(ans);
            return;
        }
        char ch=ori.charAt(ind);
        if(ori.length()==1){
            if (flag==true)sub(ans+ch, ori, ind+1,true);
             sub(ans, ori, ind+1,true);
             return;
        }
        char dh=ori.charAt(ind);
        if(ch==dh){
            if(flag==true)sub(ans+ch, ori, ind+1,true);
            sub(ans, ori, ind+1,false);
        }else{
            if(flag==true)sub(ans+ch, ori, ind+1,true);
            sub(ans, ori, ind+1,true);
        }
        

    }
    public static void main(String[] args) {
        String str="aab";
        reSub r=new reSub();
        r.sub("", str, 0,true);
        
    }
}