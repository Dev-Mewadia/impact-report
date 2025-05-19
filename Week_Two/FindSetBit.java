import java.util.*;
public class FindSetBit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int i=sc.nextInt();
      while(i>0){
           
            n=n/10;
            i--;
           
            
      }
       if(n%10==1){
                System.out.println("Yes its a set bit");
            }
            else{
                System.out.println("Not a Set bit");
            }
      
      
    }
}
