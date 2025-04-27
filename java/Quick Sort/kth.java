public class kth{
    int parition(int arr[],int si,int ei){
        int piovtElement=arr[(si+ei)/2];
       //int piovtElement=arr[si];
       int count=0;
       for(int i=si;i<=ei;i++){
           if(i==(si+ei)/2) continue;
           if(arr[i]<piovtElement) count++;
       }
       int pivotIdx=count+si;
       int temp=arr[(si+ei)/2];
       arr[(si+ei)/2]=arr[pivotIdx];
       arr[pivotIdx]=temp;
       int i=si;
       int j=ei;
       while(i<pivotIdx&& j>pivotIdx){
           if(arr[i]<=piovtElement) i++;
           if(arr[j]>piovtElement)j--;
           else if(arr[i]>=piovtElement &&arr[j]<=piovtElement){
               int tempp=arr[i];
               arr[i]=arr[j];
               arr[j]=tempp;
               i++;
               j--;
           }

       }
       return pivotIdx;
   }
   int Kth(int arr[],int si,int ei,int k){
    int pi=parition(arr, si, ei);
    if(pi+1==k) return arr[pi];
    else if(pi+1<k) return Kth(arr, pi+1, ei, k);
    else return Kth(arr, si, pi-1, k);

    
   } 
   void print(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
   }


    public static void main(String[] args) {
        int arr[]={5,1,8,2,7,-6,-6,-4};
        kth p= new kth();
        int n=arr.length;
        int k=1;
       int r= p.Kth(arr, 0, n-1, k);
       System.out.println(r);
        p.print(arr);
        
    }

}