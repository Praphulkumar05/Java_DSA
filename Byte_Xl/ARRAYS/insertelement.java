public class insertelement {

    public static int [] Start(int arr[],int target){     //insert at start..
        int n = arr.length;
        int brr[]= new int[n+1];
        for(int i=0;i<n;i++){
            brr[i+1]=arr[i];
            
        }
        brr[0]=target;
        return brr;

    }

    public static int [] End(int arr[],int target){
        int n = arr.length;
        int brr[]= new int[n+1];
        for(int i =0;i<n;i++){
            brr[i]=arr[i];
        
        }
        brr[n]=target;
        System.out.println(arr.length);
        System.out.println(brr.length);
        return brr;
    }


    public static int [] Any(int arr[],int target ,int idx){
        int n = arr.length;

        if(idx<0||idx>n) return arr;

        int newArrr[]= new int[n+1];
        int j=0;
        for(int i =0 ;i<n;i++){
            if(i==idx){
                newArrr[j]=target;
                j++;
            }
                newArrr[j]=arr[i];
                j++;
            
        }
        
        if(idx==n){
            newArrr[j]=target;
        }
        return newArrr;
    }
    
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int target = 100;
        int idx=9;
        int newArrr[] = Any(arr, target, idx);
        for(int i=0;i<newArrr.length;i++){
            System.out.print(newArrr[i]+" ");
        }
       
        
    }
}
