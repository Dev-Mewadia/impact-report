import java.util.*;

public class NumDiv {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the start value:");
    int lower= sc.nextInt();
    System.out.println("Enter the end value:");
    int upper=sc.nextInt();
   
    for(int i=lower; i<=upper;i++){
    if(i%7==0 && i%9==0){
            System.out.println(i);
        }
    }
  }
}
