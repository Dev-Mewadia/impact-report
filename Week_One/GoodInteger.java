import java.util.*;
public class GoodInteger {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
    int count=0;
      int arr[]=new int[n];
      for(int i=0; i<n;i++){
        arr[i]=sc.nextInt();
        int x=1;
        count++;
      int y=(int)(Math.cbrt(arr[i]));
      int z=(int)(Math.pow(x,3)+Math.pow(y,3));
      if(z==arr[i]){
        System.out.println("Yes a good integer");
      }
      else{
        System.out.println("Not a good integer");
      }
      }
      

    }
  
}
