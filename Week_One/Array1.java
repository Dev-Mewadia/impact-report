
import java.util.*;
public class Array1{
    public static void main(String args[]){
        System.out.println("Enter the size:");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int [n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
            System.out.println(arr[i]);
        }
        
    }
}