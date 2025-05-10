import java.util.Scanner;
class Demo{
    public static void main(String args[]){
        Scanner ab=new Scanner(System.in);
        int n=ab.nextInt();
        int first_digit=n/1000;
        int Second_digit=n%10;
        System.out.println(first_digit+Second_digit);

    }
}