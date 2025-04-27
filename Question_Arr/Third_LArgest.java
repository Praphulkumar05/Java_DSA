public class Third_LArgest {
    public static int Third(int arr[]){
      int n =arr.length;
      int f=Integer.MIN_VALUE,s=Integer.MIN_VALUE,t=Integer.MIN_VALUE;
      if(n<3) return -1;
      for(int i =0;i<n;i++){
        if(arr[i]>f){
            t=s;
            s=f;
            f=arr[i];
        }else if (arr[i]>s&&arr[i]<f){
            t=s;
            s=arr[i];
        }else if(arr[i]>t&&arr[i]<s){
            t=arr[i];
        }
      }
      if(t==Integer.MIN_VALUE){
        return -1;

      }
      return t;

    }
    public static void main(String[] args) {
        int arr[] ={855, 450, 132 ,359 ,233, 825, 604, 481, 262, 337, 720, 525, 652, 300, 906 ,219 ,926 ,906 ,293,864, 817, 498, 30 ,639, 661};
        System.out.println(Third(arr));
        
    }
    
}
