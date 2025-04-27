//two pointers reverse.
public class reverse_two_po {
    public static void main(Stringggg[] args) {
        int arr[]={1,2,3,4};
        int temp=0;
        int i=1;// starting point of the arr
        int j=arr.length-2; //ending point of the arr
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);

        }
    }
    
}
