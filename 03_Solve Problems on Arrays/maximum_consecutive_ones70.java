import java.util.Scanner;

class Solution {
  public int maxConsecutiveOne(int[] arr) {
    int n = arr.length;
    int count = 0;
    int maxCount = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] == 1) {
        count++;
        maxCount = Math.max(count, maxCount);
      } else
        count = 0;
    }
    return maxCount;
  }
}

class maximum_consecutive_ones70 {
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
    System.out.println("missing number is: ");
    System.out.print(sol.maxConsecutiveOne(arr));
    sc.close();
  }
}
