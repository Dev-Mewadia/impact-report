import java.util.*;

public class palindrome_string {
    public static void main(String[] args) {
        String s = "malayalam";
        int i = 0;
        int j = s.length() - 1;
        boolean isPalindrome = true;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        if (isPalindrome) {
            System.out.println("Yes, it's a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
