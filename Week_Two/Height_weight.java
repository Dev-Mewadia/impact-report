import java.util.*;
public class Height_weight {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n*2];
       int max_height=0;
       int max_weight=0;
       int max_h_i=0;
       int max_w_i=0;

for(int i=0; i<n*2;i++){
 arr[i]=sc.nextInt();
}

       for(int i=0; i<n*2; i++){
         if(i%2==0){
            if(arr[i]>max_height){
                max_height=arr[i];
                max_h_i=i;
            }
         }
         else{
            if(arr[i]>max_weight){
                max_weight=arr[i];
                max_w_i=i;
            }
         }

       }
       System.out.println("maximum height:"+max_height);

     System.out.println("maximum weight:"+max_weight);
        System.out.println("person with max height:"+((max_h_i/2)+1));
        System.out.println(" person with maximum weight:"+((max_w_i/2)+1));

        }
    }

