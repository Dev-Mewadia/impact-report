import java.util.*;
public class evenNuminarr {
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0; i<=n; i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                System.out.println("Yes it even"+ arr[i]);
            }
            else{
                System.out.println("not a even " + arr[i]);
            }
        }
    }
}
