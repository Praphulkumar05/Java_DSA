public class zeros_and_ones_sort {
    static void sort(int[] a){
        int numberofzeros=0;
        int numberofones=0;
        int numberoftwos=0;
        int size=a.length;
        for(int i=0;i<size;i++){
            if(a[i]==0) numberofzeros++;                                                                    
            if (a[i]==1)numberofones++;
            if(a[i]==2)numberoftwos++;
        }
        for(int i=0;i<size;i++){
            if(i<numberofzeros) a[i]=0;
                else if(i< (numberofzeros+numberofones)) a[i]=1;
                else a[i]=2;
            
        }
    }
    public static void main(String[] args) {
        int a[]={2,0,2,1,1,0};
        sort(a);
        System.out.print("Sorted arr is: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        
    }
    
}
