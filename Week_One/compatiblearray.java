import java.util.*;

public class compatiblearray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of arr1:");
        int n = sc.nextInt();

        System.out.println("Enter the size of arr2:");
        int m = sc.nextInt();

        int arr1[] = new int[n];
        int arr2[] = new int[m];

        System.out.println("Enter elements for arr1:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter elements for arr2:");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        if (n != m) {
            System.out.println("Arrays are not compatible (different sizes)");
            return;
        }

        boolean compatible = true;
        for (int i = 0; i < n; i++) {
            if (arr1[i] < arr2[i]) {
                compatible = false;
                break;
            }
        }

        if (compatible) {
            System.out.println("Compatible arrays");
        } else {
            System.out.println("Not compatible arrays");
        }
    }
}
