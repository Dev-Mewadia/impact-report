import java.util.*;
public class sumofdigits {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      
      int n=sc.nextInt();
      int digit;
      int ans=0;
      for(int i=0; i<4;i++){
        digit=n%10;
        n=n/10;
        ans=ans+digit;
      }
    
      System.out.println(ans);
    }
}
