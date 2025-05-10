
import java.util.*;

public class CollatzSeq {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int count=0;
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
            if(num%2==0){
             num=num/2; 
             count++;  
            }
            else{
                num=(3*num)+1;
                count++;
            }
            
            System.out.print(num+"->");
           

            
        }
        
      System.out.println("count is:"count);
    }

