import java.util.*;
public class Pyramid {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of N:");
        int n =sc.nextInt();
    for(int row=1; row<=n;row++){
      for(int col=1; col<=n-row;col++){
        System.out.print(" ");
      }
      for(int col=0; col<(2*row-1);col++){
        System.out.print("*");
      }
      System.out.println();
    }
}
}