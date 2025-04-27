public class power{
    int po(int x,int r){
        if(r==0) return 1;
        int ans=po(x,r/2);
        if(r%2==0){
            return ans*ans;
        }
        else{
            return ans*ans*x;
        }
    }
    public static void main(String[] args) {
        
        int x=21;
        int r=12;
        power k=new power();
        int d=k.po(x, r);
        System.out.println(d);
        
    }
}