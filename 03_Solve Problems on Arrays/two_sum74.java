import java.util.*;

class Solution {
  public String two_sum(int[] arr, int target) {
    // int n = arr.length;
    // for (int i = 0; i < n; i++) {
    // for (int j = i + 1; j < n; j++) {
    // if ((arr[i] + arr[j]) == target) {
    // return "Yes";
    // }
    // }
    // }
    // return "NO";
    // }
    Map<Integer, Integer> mpp = new HashMap<>();
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      int target_found = target - arr[i];
      if (mpp.containsKey(target_found)) {
        return mpp.get(target_found) + " " + i;
      }
      mpp.put(arr[i], i);
    }
    return "-1 -1";
  }
}

class two_sum74 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution sol = new Solution();
    System.out.println("Enter size of array:");
    int n = sc.nextInt();
    int target = 6;
    int arr[] = new int[n];
    System.out.println("Enter elements in array");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Two sum is there : ");
    System.out.println(sol.two_sum(arr, target));
    sc.close();
  }

}