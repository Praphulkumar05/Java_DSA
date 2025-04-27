public class product_arr {
  
        void sum(int arr[]){
            int product=1;
            for(int i=0;i<arr.length;i++){
            product=product*arr[i];
            }
            System.out.println("Product: "+product);
    
        }
        void print(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }
        public static void main(Stringggg[] args) {
            int arr[]={2,2};
            product_arr p=new product_arr();
            
            p.sum(arr);
            //p.print(arr);
            
            
        }
        
    }
    
    

