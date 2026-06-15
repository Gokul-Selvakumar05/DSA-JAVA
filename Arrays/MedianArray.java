package Arrays;
import java.util.*;
public class MedianArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int[] merge = new int[nums1.length + nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            merge[i] = nums1[i];
        }

        for (int i = 0; i < nums2.length; i++) {
            merge[nums1.length + i] = nums2[i];
        }

        Arrays.sort(merge);
        int median = merge.length / 2;
        if (merge.length % 2 == 1) {
            return merge[median];
        } else if (merge.length % 2 == 0) {
            return (merge[median - 1] + merge[median]) / 2.0;
        }
        return -1;

    }
    
    public static void main(String[] args) {
        
        int[] n1 = { 1, 2 };
        int[] n2 = { 3, 4 };

        MedianArray m = new MedianArray();
        double result = m.findMedianSortedArrays(n1, n2);
        System.out.print(result);

    }
}
    
