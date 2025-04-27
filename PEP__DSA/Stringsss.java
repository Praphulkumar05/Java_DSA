public class Stringsss {

    // public static boolean Hexa(String str) {



    //     if (str == null || str.isEmpty()) {
    //         return false;
    //     }
    //     if (str.startsWith("0x") || str.startsWith("0X")) {
    //         str = str.substring(2);
    //     }

       
    //     return str.matches("[0-9A-Fa-f]+");

    // }

    

    public static void main(String[] args) {
       // System.out.println(Hexa("0x1A3F"));

       String str = "abcd";   //A->65    //a->97
       if(str.charAt(0)>65){
        System.out.println(str.toUpperCase());
        System.out.println(Character.toUpperCase(str.charAt(0))+str.substring(1));
       }

       
            


    }
}
