import java.util.*;

class three {
  public List<List<Integer>> threeSum(int[] arr, int n) {
    Arrays.sort(arr);
    // Store final result
    List<List<Integer>> ans = new ArrayList<>();

    // First loop for first element
    for (int i = 0; i < n; i++) {
      // Skip duplicates for first element
      if (i > 0 && arr[i] == arr[i - 1])
        continue;

      // Two pointers
      int left = i + 1, right = n - 1;

      // Find pairs for current arr[i]
      while (left < right) {
        int sum = arr[i] + arr[left] + arr[right];

        if (sum == 0) {
          ans.add(Arrays.asList(arr[i], arr[left], arr[right]));
          left++;
          right--;

          // Skip duplicates for left
          while (left < right && arr[left] == arr[left - 1])
            left++;
          // Skip duplicates for right
          while (left < right && arr[right] == arr[right + 1])
            right--;
        } else if (sum < 0)
          left++;
        else
          right--;
      }
    }
    return ans;
  }
}

class three_sum90 {
  public static void main(String[] args) {
    int[] arr = { -1, 0, 1, 2, -1, -4 };
    int n = arr.length;
    three obj = new three();
    List<List<Integer>> res = obj.threeSum(arr, n);

    for (List<Integer> triplet : res) {
      for (int num : triplet)
        System.out.print(num + " ");
      System.out.println();
    }
  }
}
