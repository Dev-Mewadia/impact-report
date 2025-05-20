import java.util.*;
public class CharCount {
    public static void main(String args[]){

    
    Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       char target='p';
       int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target){
                count++;
            }
        }
        System.out.println(count);
    }
}
