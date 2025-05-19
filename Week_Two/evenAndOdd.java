
import java.util.*;
public class evenAndOdd {
    
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 8, 1, 4};
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for (int num : arr) {
            if (num % 2 == 0) even.add(num);
            else odd.add(num);
        }

        Collections.sort(odd);
        Collections.sort(even);

        List<Integer> result = new ArrayList<>();
        result.addAll(odd);
        result.addAll(even);

        System.out.println(result);
    }
}

