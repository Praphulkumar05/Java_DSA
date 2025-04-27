public class combination_sum {

    void combo(int arr[],int size,int idx,int target,int brr[],int bidx){
        if(target==0){
            for(int i=0;i<bidx;i++){
                System.out.print(brr[i]+"");
              

            }
           
            System.out.println();
            return;
            
            
        }
        if(target<0) return;
        for(int i=idx;i<arr.length;i++){
            brr[bidx]=arr[i];
            combo( arr, size, idx, target-arr[i], brr,bidx+1);
;

        }
     }
    public static void main(String[] args) {
        int arr[]={2,4,6,8};
        int target=8;
        combination_sum p=new combination_sum();
        int brr[]=new int[arr.length];
        p.combo(arr, arr.length, 0, target, brr, 0);
        
    }
    
}
