public class one_to_n {
    void print(int a,int s){
        if(a==0){
            System.out.println(s);
            return;
        }
       //System.out.println(a);
        print(a-1,s+a);
       
    }
    public static void main(String[] args) {
        int a=4;
        one_to_n p=new one_to_n();
        p.print(a,0);
        
    }
    
}
