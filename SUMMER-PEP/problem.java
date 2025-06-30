public class problem {
    public static void Max(int arr[]) {          // leetcode -> 1732
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {//12345 
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for(int j=0;j<n;j++){
            if(smax<arr[j]&&max!=arr[j])smax=arr[j];
        }
        System.out.println("First Max: "+max);
        System.out.println("Second Max: "+smax);
    }

    public static void EvenOdd(int arr[]) { // leetcode 1523
        int n = arr.length;
        int EvenCount = 0;
        int OddCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                EvenCount++;
            } else {
                OddCount++;
            }
        }
        System.out.println("Even Count: " + EvenCount);
        System.out.println("Odd Count: " + OddCount);

    }
 
    public static void reverse(int arr[]) {  //leetcode->125
        int n = arr.length;
        int first = 0;
        int end = n - 1;
        while (first < end) {
            int temp = arr[first];
            arr[first] = arr[end];
            arr[end] = temp;
            first++;
            end--;

        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void Repeated(int arr[]){
        int n =arr.length;
        boolean flag = false;
        int rep=0;
        for(int i=0;i<n;i++){
            if(arr[i]==arr[i+1]){
                rep=arr[i];
                flag=true;
                break;
            }
        }
        if(true){
            System.out.println("found: "+rep);
        }


        ///count the number of zeros and one(1,0,0,1,1,1,0)
        /// {4,7,8,3,1,10,,17} k->9 count the number of elements greater than k
    }
    public static void ZeroAndOne(int arr[]){
        int n =arr.length;
        int ZeroCount =0;
        int OneCount =0;
        for(int i =0;i<n;i++){
           if(arr[i]==1){
            OneCount++;
           }
        } 
        for(int  j =0;j<n;j++){
            if(arr[j]==0){
                ZeroCount++;
            }
        }
        System.out.println("One: "+OneCount);
        System.out.println("Zero: "+ZeroCount);
    }
    public static void Greater(int arr[],int k){
        int n = arr.length;
        int count =0;
        for(int i =0;i<n;i++){
            if(arr[i]>k){
                count++;

            }
        }
        System.out.println("Count: "+count);
    }
        public static void Sorted(int arr[]){
        int n =arr.length;
        boolean flag =true;
        for(int i =0;i<n-1;i++){
            if(arr[i]>arr[i+1]){  //1 2 3 4 5 
                flag=false;   
                break;
            }

        }
        if(flag==true){
            System.out.println("Array is sorted");
        }else System.out.println("Not sorted");



    }

    public static void main(String[] args) {
        int arr[] = {4,7,8,3,1,10,17};
        //ZeroAndOne(arr);
        Greater(arr, 2);

      // Max(arr);
        // EvenOdd(arr);
        // reverse(arr);
        // Repeated(arr);
        //Sorted(arr);

       

    }

}
