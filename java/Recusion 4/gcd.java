public class gcd {
    int gcd(int a,int b){
        if(a==0) return b;
       else  return gcd(b%a,a);
    }
    public static void main(String[] args) {
        int a=27;
        int b=45;
        gcd g=new gcd();
        int result=g.gcd(a, b);
        System.out.println("GCD is the: "+result);
        
    }
    
}
