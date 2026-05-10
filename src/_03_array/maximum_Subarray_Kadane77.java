import java.util.Scanner;

class Solution {
  public int kadanesMaxSum(int[] arr) {
    int n = arr.length;
    long sum = 0;
    long maxi = Long.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      sum += arr[i];
      if (sum > maxi) {
        maxi = sum;
      }
      if (sum < 0) {
        sum = 0;
      }
    }
    return (int) maxi;
  }

}

class maximum_Subarray_Kadane77 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution sol = new Solution();
    System.out.println("Enter size of array: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter elements in array: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("majority element n/2 is: ");
    System.out.println(sol.kadanesMaxSum(arr));
    sc.close();
  }
}