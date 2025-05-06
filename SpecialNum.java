import java.util.*;
public class SpecialNum {
    public static  void main(String args[]){
        System.out.println("Enter two 2 digit num:");
        Scanner sc= new Scanner(System.in);
        
        int start=sc.nextInt();
        int end=sc.nextInt();
      
        
   

        for(int i=start; i<=end;i++){
        int last=i%10;
        int first=(i/10);
        int sum=first+last;
        int prod=first*last;
        if(sum+prod==i){
 System.out.println(i);
        }
        }
        
    }
}
