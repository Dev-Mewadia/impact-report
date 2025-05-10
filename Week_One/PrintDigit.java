import java.util.*;
public class PrintDigit {
    public static void main(String args[]){
        long a=  78912173;
        long digit;

        while(a!=0){
            digit= a%10;
            a=a/10;
            System.out.println(digit);

        }
    }
}
