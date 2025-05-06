import java.util.*;
public class JoeyTribbiani{
    public static void main(String args[]){
        System.out.println("Enter a 3 digit num");
     Scanner sc= new Scanner(System.in);
     int num= sc.nextInt();
     if(num>100&&num<999){
        int middle=(num/10)%10;
        if((middle%3)==0){
            System.out.println("Trendy Num");
        }
        else{
            System.out.println("Not trendy");
        }
     }
    }
}