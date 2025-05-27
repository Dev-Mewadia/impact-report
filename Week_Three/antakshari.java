import java.util.*;
public class antakshari{
    public static void  main(String args[]){
        Scanner sc =new Scanner(System.in);
        String Prev= sc.nextLine();
        String Curr= sc.nextLine();
        while(Curr!="####"){
            if(Prev.charAt(Prev.length()-1)==Curr.charAt(0)){
              System.out.println(Curr);
             Prev=Curr;
            }
            else{
                break;
            }
        }




    }
}