public class secondmethodpalindrom {
    public static void main(String[] args) {
        String str = "aba";
        int i = 0;
        int j = str.length() - 1;
        boolean flag = true;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                flag = false;
                break;
            }
            i++;
            j--;

        }
        if (flag == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}
