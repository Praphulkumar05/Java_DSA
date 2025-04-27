public class zeros_another_method {
    static void sort(int a[]){
        int i=a[0];
        int j=a.length-1;
       // int temp=0;
        while(i<j){
          
            if(a[i]==0) i++;
            if(a[j]==1)j--;
            if(i>j) break;
           
        if(a[i]==1&&a[j]==0){
               a[i]=0;
               a[j]=1;
                i++; 
                j--;
            }
            //System.out.println(temp);
        }
    }
    public static void main(String[] args) {
        int a[]={1,1,0,1,0,1,1,0};
        sort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        
    }
    
}
