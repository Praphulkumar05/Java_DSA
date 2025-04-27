public class Kth_grammer{
    int kth(int n,int k){
        if(n==1) return 0;
        if(k%2==0){
            int ans=kth(n-1, k/2);
            if(ans==0) return 1;
            else return 0;

        }
        else return kth(n-1, k/2+1);
 
    }
    public static void main(String[] args) {
        int n=4;
        int k=3;
        Kth_grammer p=new Kth_grammer();
        int re=p.kth(n, k);
        System.out.println(re);
        
    }
}