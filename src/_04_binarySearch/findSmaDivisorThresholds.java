import java.util.Scanner;

class Solution {
  public int smallestDivisor(int[] arr, int limit) {
    int n = arr.length;

    int max = Integer.MIN_VALUE;
    for (int num : arr) {
      max = Math.max(max, num);
    }

    for (int d = 1; d <= max; d++) {
      int sum = 0;
      for (int i = 0; i < n; i++) {
        sum += (int) Math.ceil((double) arr[i] / d);
      }

      if (sum <= limit) {
        return d;
      }
    }

    return -1;
  }
}

class findSmaDivisorThresholds {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int limit = 6;

    Solution obj = new Solution();
    int ans = obj.smallestDivisor(arr, limit);
    System.out.println("The minimum divisor is: " + ans);
    sc.close();
  }
}