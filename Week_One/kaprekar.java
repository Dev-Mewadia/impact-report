import java.util.*;

public class kaprekar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        int sq = n * n;
        
        int count = 0;
        int temp2 = n;
        while (temp2 != 0) {
            count++;
            temp2 /= 10;
        }

        int power = (int)Math.pow(10, count);
        int right = sq % power;
        int left = sq / power;

        int sum = left + right;
        if (sum == temp) {
            System.out.println("Kaprekar number");
        } else {
            System.out.println("Not a Kaprekar number");
        }
    }
}
