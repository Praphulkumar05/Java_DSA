import java.util.*;

public class questionone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        for (int i = 0; i < str.length(); i++) { // small hai to add aur big hai to usme subtrt.
            boolean flag = true;
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
            if (ch == ' ')
                continue;
            int asci = (int) ch;
            if (asci >= 97)
                flag = false;
            if (flag == true) {
                asci += 32;
                char dh = (char) asci;
                str.setCharAt(i, dh);

            } else {
                asci -= 32;
                char dh = (char) asci;
                str.setCharAt(i, dh);
            }

        }else{
            continue;
    
        }
    }
    
        System.out.println(str);

    }
}