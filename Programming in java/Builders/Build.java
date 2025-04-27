public class Build {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("abc");
     //  StringBuilder ori= new StringBuilder(str);
        // str.setCharAt(0, 'd');      //change the string
        // System.out.println(str);
        // str.insert(3, 'p');         //insert
        // System.out.println(str);
        // str.delete(0,1);        //delete
        // System.out.println(str);
        // str.append("System"); // append(add)
        // System.out.println(str);
        StringBuilder  ptr= new StringBuilder(str).reverse();
        System.out.println(ptr);
        if(ptr.toString().equals(str.toString())){
            System.out.println("Yes");
        }else{
            System.out.println("No");               
        }
           
    }
    
}
