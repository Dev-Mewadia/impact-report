import java.util.*;
public class Staircaseprint {
    public static void main(String args[]){
    int n=4;
    for(int row=0; row<=4;row++){
        for(int col=0; col<n-row; col++){
            System.out.print(" ");
        }
        for(int col=0; col<=row; col++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}