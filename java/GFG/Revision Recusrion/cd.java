public class cd{
    public static int c(int n){
        if(n==0){
            return 0;
        }
        else{
            return 1+c(n/10);
        }

    }
    public static void main(String[] args) {
        int n=123;
        cd p=new cd();
        int result = p.c(n);
        System.out.println(result);
        
    }
}