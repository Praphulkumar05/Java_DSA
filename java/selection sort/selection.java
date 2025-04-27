public class selection {
    void sort(int a[]){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            int min=Integer.MAX_VALUE;
                int midx=-1;
                for(int j=i;j<n;j++){
                    if(a[j]<min){
                        min=a[j];
                        midx=j;
                    }
                } 
                int temp=a[midx];
                a[midx]=a[i];
                a[i]=temp;
        }

    }
    void print(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int a[]={4,-2,9,6};
        selection s=new selection();
        s.sort(a);
        s.print(a);

       

    }
    
}
