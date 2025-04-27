public class MergeSortedArr {
    void merge(int a1[], int a2[]) {
        int i = 0;
        int j = 0;
        int k = 0;
        int m = a1.length;
        int n = a2.length;
        int a3[] = new int[m + n];
       
        while (i < m && j < n) {
            if (a1[i] < a2[j]) {
                a3[k] = a1[i];
                i++;
             }else if (a1[i]==0){
                 a3[k]=a2[j];
                j++;
             }
            
            else {
                a3[k] = a2[j];
                j++;
            }
            k++;
        }
        
        while (i < m) {
            a3[k] = a1[i];
            i++;
            k++;
        }
        
        while (j < n) {
            a3[k] = a2[j];
            j++;
            k++;
        }
        for(int p=0;p<m+n;p++){
            a1[p]=a3[p];
        }
        for (int ele : a3) {
                System.out.print(ele + " ");
            }
        
        
        
    }
    
    public static void main(String[] args) {
        int a1[] = {1,2,3,0,0,0};
        int a2[] = {2,5,6};
        MergeSortedArr m = new MergeSortedArr();
        m.merge(a1, a2);
    }
}
