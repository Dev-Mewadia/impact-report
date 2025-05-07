import java.util.*;
public class roomtarrif {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the month");
        System.out.println("Enter the Rent :");
        System.out.println("Enter the no of days of stay:");
        int month= sc.nextInt();
        int rent=sc.nextInt();
        int days=sc.nextInt();
        if(month>4&&month<6||month>10&& month<12){
            System.out.printf("the rent will be:",(rent + .2*rent));
        }
    }
}
