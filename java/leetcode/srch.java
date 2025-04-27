public class srch {
    static int srch(int a[],int k){
        for(int i=0;i<a.length;i++){
            if(k==a[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int k=10;
        int re=srch(a, k);
        System.out.println(re);


        
    }
    
}
