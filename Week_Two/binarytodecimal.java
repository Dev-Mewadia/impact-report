import java.util.*;
public class binarytodecimal {
    public static void main(String args[]){
    int n=1101;
    int result=0;
    int b=1;

    while(n>0){
        int r=n%10;
        result=result+(r*b);
        b=b*2;
        n/=10;
    }
    System.out.println(result);
}
}
