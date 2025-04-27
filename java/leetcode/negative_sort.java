public class negative_sort {
    static  void print(int a[]){
      
        int i=0;
        int j=a.length-1;
        
        int temp;
       
        while(i<j){
            
            if(a[i]>0&&a[j]<0){

                temp =a[i];
                a[i]=a[j];
                a[j]=temp;      
                i++;
                j--;

            }else{
                if(a[i]<0){
                    i++;

            
            }
            if(a[j]>0)
            {
                j--;
        
            
        }
    }
}

    }
    public static void main(String[] args) {
        int a[]={1,8,3,-4,-5,6,-2};
        print(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        
    }
    
}
