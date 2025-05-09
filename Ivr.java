import java.util.*;
public class Ivr{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
   System.out.println("enter the value of n:");
   int n= sc.nextInt();
   for(int row=0; row<=n;row++){
    for(int col=0; col<=row; col++){
        System.out.print(" ");
    }
    for(int col=0; col<=n-row; col++){
        System.out.print("*");
    }
    System.out.println();
   }
}
}