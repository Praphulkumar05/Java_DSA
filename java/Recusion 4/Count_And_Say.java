public class Count_And_Say{
    String cas(int n){
        if(n==1)
        return "1";
        String str=cas(n-1);
        String ztr="";
        int fre=1;
        char ch=str.charAt(0);
        for(int i=1;i<str.length();i++){
            char dh=str.charAt(i);
            if(ch==dh){
            fre++;
            }else{
                ztr += fre+""+ch;
                fre=1;
                ch=dh;

            }
            
        }
        ztr +=fre+""+ch;
            return ztr;
    }
    public static void main(String[] args) {
        int n=5;
        Count_And_Say l =new Count_And_Say();
        String result=l.cas(n);
        System.out.println(result);
        
    }
}