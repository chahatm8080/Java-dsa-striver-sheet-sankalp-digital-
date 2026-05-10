import java.util.Scanner;

class Solution {
  public int longest_subarraysum(int[] arr, int k) {
    // int maxi = 0;
    // for (int i = 0; i < n - 1; i++) {
    // int sum = arr[i];
    // for (int j = i + 1; j < n; j++) {
    // sum += arr[j];
    // if (sum == k) {
    // maxi = j - i + 1;
    // }
    // }
    // }
    // return maxi;
    // }
    int n = arr.length;
    int maxi = 0;
    int left = 0, right = 0;
    int sum = arr[0];
    while (right < n) {
      while (left <= right && sum > k) {
        sum -= arr[left];
        left++;
      }
      if (sum == k) {
        maxi = Math.max(maxi, right - left + 1);
      }
      right++;
      if (right < n) {
        sum += arr[right];
      }
    }
    return maxi;
  }
}

class longest_subarray_with_given_sumk72 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution sol = new Solution();
    System.out.println("Enter size of array:");
    int n = sc.nextInt();
    int k = 15;
    int arr[] = new int[n];
    System.out.println("Enter elements in array");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Longest subarray is: ");
    System.out.print(sol.longest_subarraysum(arr, k));
    sc.close();
  }
}
