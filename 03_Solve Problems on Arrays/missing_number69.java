import java.util.Scanner;

class Solution {
  public int missing_number(int[] arr, int n) {
    int n1 = n + 1;
    int sum = n1 * (n1 + 1) / 2;
    int array_Sum = 0;
    for (int i = 0; i < n; i++) {
      array_Sum += arr[i];
    }
    int missing = sum - array_Sum;
    return missing;
  }
}

class missing_number69 {
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
    System.out.print(sol.missing_number(arr, n));
    sc.close();
  }
}
