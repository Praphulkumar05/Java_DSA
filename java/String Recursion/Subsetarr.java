public class Subsetarr{
    void s(int arr[],int idx,String subset){
        if(idx==arr.length){
            System.out.println(subset);
            return;
        }
        s(arr, idx+1, subset+arr[idx]+" ");
        s(arr, idx+1, subset);

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        Subsetarr pk=new Subsetarr();
        System.out.println("All the possible subsets are: ");
        pk.s(arr, 0, "");
        
    }
}