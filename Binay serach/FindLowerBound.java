public class FindLowerBound {
    public static void srch(int arr[],int key){     //this will work in sorted array only...
                                                    //this is linear srch method....
        int n = arr.length;
        // int value=0;
        // int i=0;
        // while(i<=n-1){
        //     if(arr[i]>key){
        //         value=arr[i-1];
        //         break;
        //     }
        //     i++;
        // }
        // return value;


        //using binary serach ..

        boolean flag = false;
        int l =0;
        int h =n-1;
        while(l<=h){
            int m = l+(h-l)/2;
            if(arr[m]==key){
                flag=true;
                if(m+1<n){
                    System.out.println(arr[m+1]);             /// here small change for the upper bound.. just do m+1..    
                }else {
                    System.out.println("Upper bound does not exist");
                }
                          
                break;
            }else if (arr[m]<key){
                l=m+1;
            }else h=m-1;
        }
            if(flag==false)
              //System.out.println(arr[h]);     //this for lower bound...
               System.out.println(arr[l]);
            
    
}
    public static void main(String[] args) {
        int arr[]= {1,2,4,5,9,15,18,21,24};
        int key = 21;
        //System.out.println(srch(arr, key));
        srch(arr, key);
      
    }
    
}
