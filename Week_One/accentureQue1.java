import java.util.*;

public class accentureQue1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the num: ");
        int num = sc.nextInt();

        System.out.print("Enter the value of m: ");
        int m = sc.nextInt();

        if (m == 0) {
            System.out.println("Division by zero is not allowed.");
            return;
        }

        int rem = num / m;
        int lower = rem * m;
        int upper = (rem + 1) * m;

        int dist1 = Math.abs(lower - num);
        int dist2 = Math.abs(upper - num);

        if (dist1 < dist2) {
            System.out.println(dist1);
        } else {
            System.out.println(dist2);
        }
    }
}
