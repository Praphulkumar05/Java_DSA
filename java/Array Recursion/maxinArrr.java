// public class maxInArr {                     // this logic is by storing the arr.
//     // void max(int arr[],int size,int idx,int max){
//     //     if(idx==size) {
//     //         System.out.println("Max value is: "+max);
//     //         return;
            
//     //     }
//     //     if(max<arr[idx]) max=arr[idx];
//     //     max(arr, size, idx+1, max);

//     // }
//     int Maxvalue(int []arr,int size,int idx){
//         if(idx==size){
//             return Integer.MIN_VALUE;
//         }
//         return Math.max(arr[idx], Maxvalue(arr, size, idx + 1));

//     }
//     public static void main(String[] args) {
//         int size=4;
//         int arr[]=new int[size];
//         arr[0]=34;
//         arr[1]=32;
//         arr[2]=934;
//         arr[3]=94;
//         // maxInArr m=new maxInArr();
//         // m.max(arr, size, 0,Integer.MIN_VALUE);
//         maxInArr  m1=new maxInArr();
//         int r=m1.Maxvalue(arr,size ,0);
// System.out.println(r);
        
//     }
    
// }


//   revision.




public class maxinArrr{
    int mar(int arr[],int size,int idx){
        if(idx==size)return Integer.MIN_VALUE;
        return Math.max(arr[idx], mar(arr, size, idx+1));
    }
    public static void main(Stringggg[] args) {
        int size=4;
        int arr[]=new int[size];
        arr[0]=544;
        arr[1]=34;
        arr[2]=452;
        arr[3]=46;
        maxinArrr m=new maxinArrr();
        int r=m.mar(arr, size, 0);
        System.out.println(r);

        
    }
}
