

public class linear_serch {
    static Boolean search(int arr[],int key){
        boolean found =false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("At index: "+i);
                 return found=true;
            }
           
        }
        System.out.println("element not found");
         return found =false;

    }
    public static void main(Stringggg[] args) {
        int arr[]={12,35,325,656,33};
        int key=3;
        search(arr, key);
        // boolean found=false;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==key){
        //         System.out.println("Element found at "+i+" indx");
        //         found=true;

        //     }
        //     }
        //     if(!found){
        //         System.out.println("Serch complete not found");
        //     }
        }
    }
    

