import java.util.Scanner;

class NoVowelException extends Exception {
    public NoVowelException(String message) {
        super(message);
    }
}

public class CheckVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        try {
            if (containsVowel(input)) {
                System.out.println("The string contains at least one vowel.");
            } else {
                throw new NoVowelException("No vowels found in the string.");
            }
        } catch (NoVowelException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Vowel check completed.");
        }
    }

    public static boolean containsVowel(String str) {
        str = str.toLowerCase(); 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ("aeiou".indexOf(ch) != -1) {
                return true;
            }
        }
        return false;
    }
}
