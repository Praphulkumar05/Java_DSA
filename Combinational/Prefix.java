public class Prefix {
    // public static void Pre(int arr[]){
    //     int n =arr.length;
    //     int pre[]=new int[n];
    //     int sum=0;
    //     pre[0]=arr[0];
    //     for(int i =1;i<n;i++){
    //         pre[i]=pre[i-1]+arr[i];
    //     }

        // for(int i =0;i<n;i++){
        //     System.out.print(pre[i]+" ");
        // }
// } 
// public static int strStr(String str ,String key){
//     int n= str.length();
//     int m =key.length();
//     // for(int i =0;i<n;i++){
//     //     if(str.charAt(i)==key.charAt(i)){
//     //         return i;
//     //     }
//     // }
//     int i =0;
//     // while(i<n){
//     //     if(str.charAt(i)==key.charAt(i)){
//     //         return i;
//     //     }
//     //     i++;
//     // }
//     while(i<n&&i<m){
//         if(str.charAt(i)==key.charAt(i)){
//             return i;
//         }
//         i++;
//     }
  
//     return -1;



// }  
public static int   sqt(int n){
    double p = Math.sqrt(n);
   return(int) p;

}

    public static void main(String[] args) {
        System.out.println(sqt(8));
         
        

        
    }
    
}
