import java.util.*;
   public class  printoddeven{
      public static void main(String args[]){
        System.out.println("Enter a num betwwn 0-10");
        Scanner sc=new Scanner(System.in);

        int num= sc.nextInt();
        if (num<9){
        if(num==0){
            System.out.println("0");
        }
        else if(num %2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
       }
    }
}
      
    
