public class binaryString {
    void sb(String s,int n)
    {
        
        if(s.length()==n){
            System.out.println(s);
            return;
        }

        sb(s+"0",n);
        if(s==""||(s.charAt(s.length() - 1) == '0'))sb(s+ "1",n);
       

       }
    
    public static void main(String[] args) {
        int n=2;
        binaryString bp=new binaryString();
        bp.sb("",n);
    }
    
}
