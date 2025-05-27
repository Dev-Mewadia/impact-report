import java.util.*;
public class Motorcycle {
    
    public static void main(String args[]) {
        String s = "Bikeway";
        String x = "Bike";
        int i = 0;

       
        while (i < x.length() && i < s.length() && x.charAt(i) == s.charAt(i)) {
            i++;
        }


        System.out.println(s.substring(i));  
    }
}


