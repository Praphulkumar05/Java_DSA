    import java.util.*;

    public class palindronstring {
        public static void main(String[] args) {
        
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the String: ");

            StringBuilder gtr = new StringBuilder(sc.nextLine());
        
            String ori="";
            for(int i=0;i<gtr.length();i++){
                ori+=gtr.charAt(i);
            }



            String rev="";
            for(int i=gtr.length()-1;i>=0;i--){
                rev+=gtr.charAt(i);
            }
            //System.out.println(rev);
            if(rev.equals(ori)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
          


        // String reverseg = "";

        // for (int i = 0; i < gtr.length(); i++) {
        //     reverseg += gtr.charAt(i);
        // }

        // if (gtr.equals(reverseg)) {
        //     System.out.println("String is Palindrone");
        // } else {
        //     System.out.println("String is not palindrone");
        // }

    }

}
