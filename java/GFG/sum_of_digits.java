public class sum_of_digits {
    int print(int n){
        if(n==0){
            return 0;
        }
        else return(n%10+ print(n/10));


    }
    public static void main(String[] args) {
        int n=123;
        sum_of_digits p=new sum_of_digits();
        int r=p.print(n);
        System.out.println(r);

        
    }
    
}
