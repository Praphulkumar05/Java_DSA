public class reverse_int {
    public static void main(Stringggg[] args) {
       int rev=0;
       int x=-122;

       while(x>0||x<0){
        int last=x%10;
        rev=rev*10+last;
        x=x/10;

       }
       System.out.println(rev);

    }
    
}
