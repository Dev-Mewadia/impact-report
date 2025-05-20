import java.util.*;


public class vowelInSring {
    public static void main(String args[]){
           Scanner sc = new Scanner(System.in);
           String s =sc.nextLine();
           int count=0;
        
           String vowel="aeiouAEIOU";
         for( int i=0; i<s.length(); i++){
             
              char v=s.charAt(i);
              if(vowel.index(v)!=-1){
                count ++;
              }

         }
         System.out.println(count);
    }
}
