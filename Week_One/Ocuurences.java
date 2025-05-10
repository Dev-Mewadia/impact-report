
import java.util.*;

public class Ocuurences {
    public static void main(String args[]){
        int n= 799888992;
        int m=9;
        int digit=0;
        int count =0;
        while (n!=0){
         digit=n%10;
         n=n/10;
         if(m==digit){
            count++;
            System.out.println(count);
        
        }
            
}
}
    
}

