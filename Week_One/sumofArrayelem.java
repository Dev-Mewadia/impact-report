import java.util.*;
public class sumofArrayelem {
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the size of arr1");
     int n=sc.nextInt();
     System.out.println("Enter the size of arr2");
     int m=sc.nextInt();
     int arr[]= new int[n];
     int arr2[]=new int[m];
     int sum1=0;
     int sum2=0;
     
     for(int i=0; i<n;i++){
          arr[i]=sc.nextInt();
       sum1= sum1+arr[i];
  }
 System.out.println(sum1);

 for(int j=0; j<n;j++){
    arr[j]=sc.nextInt();
    sum2=sum2+arr[j];
 }
System.out.println(sum2);

if(sum1==sum2 && arr.length==arr2.length){
    System.out.println("Cindrellas princess");
}
else{
    System.out.println("not a cindrela");
}
}
}
