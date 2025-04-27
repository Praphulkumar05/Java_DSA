public class insert_first {
    public static void main(String[] args) {
        int oriarr[]={1,2,3,4,5};
        int key=6;
        int updatearr[]=new int[oriarr.length+1];
        for(int i=0 ;i<oriarr.length;i++){
            updatearr[i+1]=oriarr[i];


        }
        updatearr[0]=key;
        for(int i=0;i<updatearr.length;i++){
            System.out.print(updatearr[i]+" ");
        }
    }
    
}
