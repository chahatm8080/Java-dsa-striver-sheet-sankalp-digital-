import java.util.*;

class twoSum {
  public int[] two_sum(int[] arr, int target) {
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

    // Map<Integer, Integer> mpp = new HashMap<>();
    // int n = arr.length;
    // for (int i = 0; i < n; i++) {
    // int target_found = target - arr[i];
    // if (mpp.containsKey(target_found)) {
    // return mpp.get(target_found) + " " + i;
    // }
    // mpp.put(arr[i], i);
    // }
    // return "-1 -1";

    // -------------------------------optimal if not sorted
    int n = arr.length;

    int[][] pairs = new int[n][2];

    for (int i = 0; i < n; i++) {
      pairs[i][0] = arr[i];
      pairs[i][1] = i;
    }

    Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));

    int left = 0, right = n - 1;

    while (left < right) {
      int sum = pairs[left][0] + pairs[right][0];
      if (sum == target) {
        return new int[] { pairs[left][1], pairs[right][1] };
      } else if (sum < target) {

        left++;
      } else {
        right--;
      }
    }
    return new int[] { -1, -1 };
  }
}

class two_sum74 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    twoSum sol = new twoSum();
    System.out.println("Enter size of array:");
    int n = sc.nextInt();
    int target = 9;
    int arr[] = new int[n];
    System.out.println("Enter elements in array");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Two sum is there : ");
    int[] ans = sol.two_sum(arr, target);
    System.out.println(Arrays.toString(ans));
    sc.close();
  }

}