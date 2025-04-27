import java.util.*;

public class s {


    public static void Sort(int a[],int n){
        n = a.length;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && a[j]<a[j-1]){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i--;

            }
        }
    }
    public static void display(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        Sort(a, 5);
        display(a);
        
                
    }
    
}
