import java.util.*;

public class medianTwoSortedArray {

  public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

    int n = nums1.length;
    int m = nums2.length;

    int[] merged = new int[n + m];

    int i = 0, j = 0, k = 0;

    while (i < n && j < m) {
      if (nums1[i] <= nums2[j]) {
        merged[k++] = nums1[i++];
      } else {
        merged[k++] = nums2[j++];
      }
    }

    while (i < n) {
      merged[k++] = nums1[i++];
    }

    while (j < m) {
      merged[k++] = nums2[j++];
    }

    int total = n + m;

    if (total % 2 == 1) {
      return merged[total / 2];
    }

    return (merged[total / 2] + merged[(total / 2) - 1]) / 2.0;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] nums1 = new int[n];

    for (int i = 0; i < n; i++) {
      nums1[i] = sc.nextInt();
    }

    int m = sc.nextInt();
    int[] nums2 = new int[m];

    for (int i = 0; i < m; i++) {
      nums2[i] = sc.nextInt();
    }

    System.out.println(findMedianSortedArrays(nums1, nums2));

    sc.close();
  }
}
