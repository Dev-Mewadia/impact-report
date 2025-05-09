
import java.util.*;
public class BinaryCon {
    public static void main(String args[]){
        System.out.println("Enter the num:");
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        int ans=0;
      while(num!=0){
        int rem=num%2;
        ans=ans*10 +rem;
        num=num/2;
        System.out.println(rem);
      }
    
      
    }
}
