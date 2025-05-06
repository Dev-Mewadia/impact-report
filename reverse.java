import java.util.*;
public class reverse {
    public static void main(String args[]){
        int ans=0;
        System.out.println("Enter a 3 digit num:");
        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();
    
        while (num!=0){
          int digit=num%10;
          ans=ans*10+ digit;
          num=num/10;
        }
        System.out.println(ans);
    }
}
