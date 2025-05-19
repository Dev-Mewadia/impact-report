
import java.util.*;

public class DecimalToBinary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();

        int binary = 0;
        int place = 1;

        while (n > 0) {
            int rem = n % 2;
            binary += rem * place;
            place *= 10;
            n /= 2;
        }

        System.out.println("Binary: " + binary);
        sc.close();
    }
}

