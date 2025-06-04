import java.util.*;

class except {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter Num:");
            int num = scanner.nextInt();

            System.out.println("Enter Den:");
            int den = scanner.nextInt();

            int result = num / den;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Division by zero");
        } 
        catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        } 
        finally {
            System.out.println("Division operation completed");
            scanner.close();
        }
    }
}
