

public class bb {
    public static void main(String[] args) {
        String st="123";
        try{
        int convrt=Integer.parseInt(st);
        System.out.println(convrt);


        }catch(NumberFormatException e){
            System.out.println("Invalid input: ");
        }
        
    }
    
}
