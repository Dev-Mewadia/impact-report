import java.util.*;
public class AdamsNum {
    public static  void main(String args[]){
        System.out.println("Enter a num to check adams num:");
   Scanner sc = new Scanner(System.in);
   //input of num
   int num= sc.nextInt();
   //num ka square 
   int sq=num*num;
   //num ko reverse
   int rev=0;
   int digit;
   while(num!=0){
  digit=num%10;
   rev=rev*10+digit;
  num=num/10;
 }
 System.out.println(rev);
    int sq_rev=rev*rev;
    int ans2=0;
//reverse the square of reverse_num
    while(sq_rev!=0){
        digit=sq_rev%10;
        ans2=(ans2*10)+ digit;
        sq_rev=sq_rev/10;
    
    }
    System.out.println();

    if(rev==ans2){
        System.out.println("yes");
    }
    else{
        System.out.println("No");
    }
    }
}
