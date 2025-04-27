
// import java.util.Scanner;

// public class InsertAtAnyIndex {
//     public static void main(String[] args) {
//         int oriarr[] = {1, 2, 3, 4, 5};
//         Scanner scanner = new Scanner(System.in);

//         // Take the element to be inserted as input
//         System.out.print("Enter the element to insert: ");
//         int key = scanner.nextInt();

//         // Take the index at which the element should be inserted as input
//         System.out.print("Enter the index at which to insert the element: ");
//         int index = scanner.nextInt();

//         // Check if the index is valid
//         if (index < 0 || index > oriarr.length) {
//             System.out.println("Invalid index");
//             return;
//         }

//         // Create a new array with one additional element
//         int updatearr[] = new int[oriarr.length + 1];

//         // Copy elements before the specified index
//         for (int i = 0; i < index; i++) {
//             updatearr[i] = oriarr[i];
//         }

//         // Insert the new element at the specified index
//         updatearr[index] = key;

//         // Copy the remaining elements after the specified index
//         for (int i = index; i < oriarr.length; i++) {
//             updatearr[i + 1] = oriarr[i];
//         }

//         // Print the updated array
//         for (int i = 0; i < updatearr.length; i++) {
//             System.out.print(updatearr[i] + " ");
//         }
//     }
// }

import java.util.*;
public class anyIndex{
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int mul=a*b;
        
        // System.out.println("Product will be: "+mul);
        int arr[] ={1,2,3,4,5,6};
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        
    }
}
// }

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter  size of the elements: ");
//         int size =sc.nextInt();
//         int arr[]=new int[size];
//         System.out.println("Enter the elements");
//         for(int i=0;i<size-1;i++){  
//             arr[i]=sc.nextInt();
            
//         }
//         System.out.println("Enter at which idx you want to print");
//         int index=sc.nextInt();
//         System.out.println("Element that you want to insert: "); 
//         int key=sc.nextInt();
//         for(int i=size-1;i>=index;i--){
//             arr[i]=arr[i-1];
//         }
//         arr[index]=key;

//         System.out.println("Updated arr: ");
//         for(int i=0;i<arr.length;i++){
//         System.out.println(arr[i]);
//         }

//     }
// }
// static void print(int arr[],int index,int size,int key){

//         for(int i=size;i>=index+1;i--){
//             arr[i]=arr[i-1];

//         }
//         for(int i=0;i<=index;i++){
//             if(i==index){
//                 arr[i]=key;
//             }
//         }
//         arr[index]=key;
//     }
//     void display(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i]);
//         }
//     }

// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter  size of the elements: ");
//             int size =sc.nextInt();
//             int arr[]=new int[size+1];
//             System.out.println("Enter the elements");
//             for(int i=0;i<size-1;i++){  
//                 arr[i]=sc.nextInt();
                
//             }
//             System.out.println("Enter at which idx you want to print");
//             int index=sc.nextInt();
//             System.out.println("Element that you want to insert: "); 
//             int key=sc.nextInt();
//             print(arr, index, size, key);
//             anyIndex p=new anyIndex();
//            p.display(arr);
          
   
// }
// } 
//     static int insert(int arr[], int cap, int n, int index, int x) {
//         if (n == cap) return n;
//         // int index = pos - 1;
//         for (int i = n - 1; i >= index; i--) {
//             arr[i + 1] = arr[i];
//         }
//         arr[index] = x;
//         return arr[index];
//     }

//     public static void main(Stringggg[] args) {
//         int arr[] = new int[100]; // creating a larger array to accommodate the capacity
//         int n = 6; // number of elements in the array
//         int cap = 100; // capacity of the array
//         int x = 90; // element to be inserted
//         // int pos = 3;
//         int index =5; // position to insert the element

//         // initializing the array with elements
//         arr[0] = 1;
//         arr[1] = 2;
//         arr[2] = 3;
//         arr[3] = 4;
//         arr[4] = 5;

//         int re = insert(arr, cap, n, index, x);
//         // System.out.println("New size of the array: " + re);
//         System.out.print("Array after insertion: ");
//         for (int i = 0; i < re; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
 
   