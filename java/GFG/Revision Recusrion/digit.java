public class digit{
     public static int sum(int n){
        if(n==0){
            return 0;
        }
        else return n%10+sum(n/10);
    }
    
    
    public static void main(String[] args) {
        int n=123;
        digit d=new digit();
        int result=d.sum(n);
        System.out.println(result);
        
        
    }
}