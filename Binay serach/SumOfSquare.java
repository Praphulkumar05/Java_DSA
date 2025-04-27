public class SumOfSquare {
    public static boolean isPerfectSq(int n){
        int root = (int)Math.sqrt(n);
        if(root*root==n){
            return true;
        }
        else return false;
    }
    public static boolean judgeSqaure(int a){
        int x =0;
        int y =a;
        while(x<=y){
            if(isPerfectSq(x)&&isPerfectSq(y)){
                return true;

            }else if(!isPerfectSq(y)){
                y =(int)Math.sqrt(y)*(int)Math.sqrt(y);
                y=a-y;
            }else{
                x=((int)Math.sqrt(x)+1)*((int)Math.sqrt(x)+1);
                x=a-x;
            }
        }
        return false;
        
    }
    public static void main(String[] args) {
         int a = 3;
         System.out.println(judgeSqaure(a));
        
    }
    
}
