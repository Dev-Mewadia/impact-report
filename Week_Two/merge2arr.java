import java.util.*;
public class merge2arr {
    public static void main(String args[]){
        
        int nums1[]={10,15,17};
        int nums2[]={12,13};
          int n=nums1.length;
        int m=nums2.length;
        int nums3[]=new int[m+n];
        int i=0,j=0,k=0;
      

        while(i<n&&j<m){
            if(nums1[i]<nums2[j]){
                nums3[k]=nums1[i];
                i++;
            }
            else{
                nums3[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<n){
            nums3[k]=nums1[i];
            i++;
            k++;
        }
        while(j<m){
            nums3[k]=nums2[j];
            j++;
            k++;
        }
       System.out.println(Arrays.toString(nums3));
    }
}
