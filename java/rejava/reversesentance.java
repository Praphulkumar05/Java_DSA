public class reversesentance {

    public static void main(String[] args) {
        String str = "i am an educator";
        String ans = "";

        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                sb.append(ch);

            } else {
                sb.reverse();
                ans += sb;
                ans += " ";
                sb = new StringBuilder("");

            }

        }
        sb.reverse();
        ans += sb;
        System.out.println(ans);

    }

}
