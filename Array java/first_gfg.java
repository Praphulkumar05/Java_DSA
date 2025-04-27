import java.util.Arrays;
import java.util.Scanner;

// public class first_gfg {

    // static int insert(int arr[], int cap, int n, int index, int x) {
    // if (n == cap) return n;
    // // int index = pos - 1;
    // for (int i = n - 1; i >= index; i--) {
    // arr[i + 1] = arr[i];
    // }
    // arr[index] = x;
    // return (n + 1);
    // }

    // public static void main(String[] args) {
    // int arr[] = new int[100]; // creating a larger array to accommodate the
    
    // int n = 5; // number of elements in the array
    // int cap = 100; // capacity of the array
    // int x = 90; // element to be inserted
    // int index = 5; // position to insert the element

    // // initializing the array with elements
    // arr[0] = 1;
    // arr[1] = 2;
    // arr[2] = 3;
    // arr[3] = 4;
    // arr[4] = 5;

    // int re = insert(arr, cap, n, index, x);
    // System.out.println("New size of the array: " + re);
    // System.out.println("Array after insertion: " +
    // Arrays.toString(Arrays.copyOfRange(arr, 0, re)));
    // }
    // }
 public class first_gfg {
    static void insert(int arr[],int size,int element,int idx){
            for(int i=size-1;i>=idx;i--){
                arr[i+1]=arr[i];
            }
            arr[idx]=element;
            

    }
    public static void main(Stringggg[] args) {
      
        int size=5;
        int arr[]=new int[size+1];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        // arr[5]=6;
        int idx=5;
        int element=90;
    insert(arr, size, element, idx);
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }


        
    }
 }