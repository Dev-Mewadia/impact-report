import java.util.*;
public class fibonacci {
    public static void main(String args[]){
        System.out.println("Enter a number:");
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int a=0;
    int b=1;
    int next=0;
    for(int i=2; i<num;i++)
{
 next=a+b;
 a=b;
 b=next;
 
}
System.out.println(next);
}
}
