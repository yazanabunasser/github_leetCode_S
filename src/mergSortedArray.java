import java.util.Arrays;
import java.util.LinkedList;

public class mergSortedArray {
      public static void merge(int[] nums1 , int m , int[] nums2, int n){
        int  n1=0 , n2=0 , w=0;
        int[] nums3 = new int[nums1.length];
        for(int i =0 ; i < nums1.length ; i++){
            nums3[i]= nums1[i];
        }
        while (n1 <= m && n2 <= n){
            if(n1 == m && n2== n){
                break;
            }else if(n1 == m ){
                nums1[w] =nums2[n2];
                n2++;
                w++;
            }else if(n2 == n ){
                nums1[w] =nums3[n1];
                n1++;
                w++;
            } else if(nums3[n1] < nums2[n2]){
                nums1[w] =nums3[n1];
                n1++;
                w++;
            } else if(nums3[n1] > nums2[n2] || nums3[n1] == nums2[n2]){
                nums1[w] =nums2[n2];
                n2++;
                w++;
            }
        }
          System.out.println(Arrays.toString(nums1));

    }
}
