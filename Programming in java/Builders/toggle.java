
public class toggle {
    public static boolean IsReverse(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;

            }
            i++;
            j--;
        }
        return true;

    }

    public static void main(String[] args) {
        String str = "abc"; 
        int cnt=0;
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                if(IsReverse(str.substring(i,j+1) )==true){
                    System.out.println(str.substring(i,j+1));
                    cnt++;
            }
            }
        }
        System.out.println(cnt  );

    }
}

