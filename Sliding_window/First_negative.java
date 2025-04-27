

public class First_negative {
    // public static int[] First(int arr[], int k){
    //     int n = arr.length;
    //     int ans[] = new int[n-k+1];
    //     for(int i=0;i<=n-k;i++){


    //         for(int j=i;j<i+k;j++){
    //             if(arr[j]<0){
                    
    //                 ans[i]=arr[j];
                   
    //                 break;
                
                
    //             }
               
    //         }
    //     }
    //     return ans;
    // }
    public static int [] First(int arr[],int k){
        int n =arr.length;
        int p=-1;
        int ans[]= new int[n-k+1];
        for(int i =0;i<k;i++){
            if(arr[i]<0){
                p=i;
                break;
            }

        }
        if(p==-1) ans[0]=0;
        else ans[0]=arr[p];
        int i =1;
        int j =k;
        while(j<n){
            if(p>=i) ans[i]=arr[p];
            else{
                p=-1;
                for(int x= i;x<=j;x++){
                    if(arr[x]<0){
                       p=x;
                       break;

                    }

                }
                if(p!=-1){
                    ans[i]=arr[p];

                }else{
                    ans[i]=0;
                }
               
            }
            i++;
            j++;
        }
        return ans;

        
    }
    public static void main(String[] args) {
        int arr[]={-8, 2, 3, -6, 10};
        int k =2;
        int ans[]=First(arr,k);
        for(int i =0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        
    }
    
}
