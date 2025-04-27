
    public class MAximun_Sum_Arr {
        // public static int Maximum(int arr[], int k) {
        // int n = arr.length;
        // int Smax = Integer.MIN_VALUE;
        // int idx = -1;
        // for (int i = 0; i <= n - k; i++) {
        // int sum = 0;
        // for (int j = i; j < i+ k; j++) {
        // sum = sum + arr[j];
        // }
        // if (Smax < sum) {
        // Smax = sum;
        // idx = i;

        // }
        // }
        // System.out.println(idx);

        // return Smax;

        // }
        public static int Maxi(int arr[],int k){      //Sliding Windows Concept ....
                                                        //TC.O(n);
            int n = arr.length;
            int PreSum=0;
            int Max=Integer.MIN_VALUE;
            int MAxidx=-1;
            for(int i =0;i<k;i++){
                PreSum=PreSum+arr[i];
            }
            Max=PreSum;
            int i=1;
            int j =k;
            while(j<n){
                PreSum=PreSum+arr[j]-arr[i-1];
                if(Max<PreSum){
                    Max=PreSum;
                    MAxidx=i;

                }
              
                i++;
                j++;

            }
            System.out.println(MAxidx);
            return Max;
        }

               public static void main(String[] args) {
            int arr[] = { 100, 200, 300, 400 };
            int k = 1;
            System.out.println(Maxi(arr, k));

        }

    }
