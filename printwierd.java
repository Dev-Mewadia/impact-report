import java.util.*;
public class printwierd {

public static void main(String args[]){
System.out.println("Enter a num:");
Scanner sc= new Scanner(System.in);
int num=sc.nextInt();
if((num&1)==1){
    System.out.println("Weird");

}
if(num>5&&num<2&&((num&1)==0)){
System.out.println("even");

}
if(num>6&&num<20&&((num&1)==0)){
System.out.println("Not even")
}

}
}
    

