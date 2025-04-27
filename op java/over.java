 class A{
    int a;
    public int p(){
        return 3;
    }
    public void namae(){
        System.out.println("From class A");
    }
 }
class  B extends A{
    public void namae(){
        System.out.println("From Class B");
    }
    public int o(){
        return 2;
    }
}
public class over {
    public static void main(String[] args) {
         A q= new A();
         q.namae();
         B w = new B();
         w.namae();
        
    }
    
}
