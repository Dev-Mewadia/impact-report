import java.util.*;

public class Bus {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int groups = sc.nextInt();
        int buscap = sc.nextInt();

        int count = 0;
        int load = 0;

        int arr[] = new int[groups];
        for (int i = 0; i < groups; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < groups; i++) {
            if (arr[i] > buscap) {
                System.out.println("Group size exceeds bus capacity. Invalid input.");
                return;
            }

            if (load + arr[i] <= buscap) {
                load += arr[i];
            } else {
                count++;       
                load = arr[i];   
            }
        }

        
        if (load > 0) {
            count++;
        }

        System.out.println(count);
    }
}
