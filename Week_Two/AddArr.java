
import java.util.*;
public class AddArr {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
       System.out.println("enter the size of array 1:");
       int n=sc.nextInt();
       System.out.println("enter the size of array 2:");
       int m=sc.nextInt();

       int array1[]=new int[n];
       int array2[]=new int[m];
       System.out.println("enter the elements of arr 1:");
       for(int i=0; i<n; i++){
    
        array1[i]=sc.nextInt();
       }
           System.out.println("enter the elements of arr 2:");
       for(int j=0; j<m;j++){
      array2[j]=sc.nextInt();
       }
    int result1=0;
    int result2=0;
    for(int i=0; i<n; i++){
        result1=(result1*10)+array1[i];
    }
    for(int j=0; j<m; j++){
        result2=(result2*10)+array2[j];
    }
 int sum=result1+result2;
    System.out.println("1st array elems:"+result1);
    System.out.println("2nd array result:"+result2);
    System.out.println("Sum of  Results:"+sum);
}
}

