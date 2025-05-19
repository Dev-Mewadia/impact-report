import java.util.*;
public class Cards {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of arr:");
        int n= sc.nextInt();
        System.out.println("enter the4 elements of an array");
        int arr[]= new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
            System.out.println(arr[i]);
        }
        System.out.println("Enter the target index:");
        int target=sc.nextInt();
        System.out.println("the element to be inserted");
        int elem=sc.nextInt();
        int lastelem=arr[n-1];
        int temp[]=new int[n+1];
        for(int i=0; i<target; i++){
             temp[i]=arr[i];
        }
        temp[target]=elem;
        for (int i = target; i < n; i++) {
            temp[i + 1] = arr[i];
        }

        System.out.println("Array after insertion:");
        for (int i = 0; i <= n; i++) {
            System.out.print(temp[i] + " ");
    }
}
}