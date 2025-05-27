import java.util.*;
public class String_Subsequence {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       String x=sc.nextLine();
       int i=0;
       int j=0;
       while(i<s.length() && j<x.length())
       {
        if(s.charAt(i)==x.charAt(j)){
        i++;
        

        }
        j++;
        if(i==x.length()){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
       }

    }
}
-