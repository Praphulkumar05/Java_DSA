public class PalindromeChecker {

//     public static boolean isPalindrome(int x) {
//         if (x < 0) {
//             return false; 
//         }
        
//         int original = x;
//         int reversed = 0;
        
//         while (x != 0) {
//             int digit = x % 10;
//             reversed = reversed * 10 + digit;
//             x /= 10;
//         }
        
//         return original == reversed;
//     }

//     public static void main(String[] args) {

//         int x=121;
      
//             boolean result = isPalindrome(x);
//             System.out.println("Input: " + x + " Output: " + result);
        
//     }
// }

public static boolean isPalindrome(int x){
    if(x<0){
        return false;
    }
    int ori=x;
    int rev=0;
    while(x>0){
        int last=x%10;
        rev=rev*10+last;
        x=x/10;
    }
    return ori==rev;
}
public static void main(String[] args) {
     int n=121;
     boolean re=isPalindrome(n);
     System.out.println("Input "+n+" Output "+re);
}
}