import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] output = new int[m + n];
        
        // Copy elements from nums1
        for (int i = 0; i < m; i++) {
            output[i] = nums1[i];
        }
        
        // Copy elements from nums2
        for (int i = 0; i < n; i++) {
            output[m + i] = nums2[i];
        }
        
        // Sort the merged array using BubbleSort
        BubbleSort.bubbleSort(output);
        
        // Print the sorted array
        for (int i = 0; i < output.length; i++) {
        	System.out.print(output[i] + " ");
        }
    }

    public static void main(String[] args) {
        MergeSortedArray a = new MergeSortedArray();
        int[] nums1 = {1, 2, 3};
        int m = 3;
        int[] nums2 = {2, 3, 4};
        int n = 3;
        a.merge(nums1, m, nums2, n);
    }
}
