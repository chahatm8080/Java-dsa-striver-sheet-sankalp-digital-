import java.util.*;

class Solution {
  public int longest_subarraysum(int[] arr) {
    // int n = arr.length;
    // int maxi = 0;
    // for (int i = 0; i < n - 1; i++) {
    // int sum = arr[i];
    // for (int j = i + 1; j < n; j++) {
    // sum += arr[j];
    // if (sum == 0) {
    // maxi = Math.max(maxi, j - i + 1);
    // }
    // }
    // }
    // return maxi;
    int n = arr.length;
    int maxi = 0;
    int prefix_sum = 0;
    Map<Integer, Integer> mpp = new HashMap<>();
    for (int i = 0; i < n; i++) {
      prefix_sum += arr[i];
      if (prefix_sum == 0) {
        maxi = i + 1;
      } else if (mpp.containsKey(prefix_sum)) {
        maxi = Math.max(maxi, i - mpp.get(prefix_sum));
      } else {
        mpp.put(prefix_sum, i);
      }
    }
    return maxi;
  }
}

class longest_subarray_zero_sumk73 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution sol = new Solution();
    System.out.println("Enter size of array:");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter elements in array");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Longest subarray is: ");
    System.out.print(sol.longest_subarraysum(arr));
    sc.close();
  }
}
