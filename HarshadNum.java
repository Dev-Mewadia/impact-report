
import java.util.*;
public class HarshadNum {
    public static void main(String args[]){
        System.out.println("ENTER THE NUM:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int digit;
        int temp=num;
        while(num!=0){
          digit=num%10;
          num=num/10;
          sum = sum + digit;
        }
         
        if(temp%sum==0){
            System.out.println("Yes a Harshad num");
        }
        else{
            System.out.println("NOT A HARSHAD NUM");
        }
    }
}
