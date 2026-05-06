import java.util.Scanner;

class Solution {
  public boolean linear_Search(int[] arr, int elmnt) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      if (arr[i] == elmnt) {
        return true;
      }
    }
    return false;
  }

  public int longest_Consecutive_Sequence(int[] arr) {
    int n = arr.length;
    int longest = 1;
    for (int i = 0; i < n; i++) {
      int x = arr[i];
      int count = 1;
      while (linear_Search(arr, x + 1) == true) {
        x += 1;
        count += 1;
      }
      longest = Math.max(longest, count);
    }
    return longest;
  }
}

class longest_Consecutive_Sequence83 {
  public static void main(String[] args) {
    Solution sol = new Solution();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of arr: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter array elements");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Longest element is: ");
    System.out.println(sol.longest_Consecutive_Sequence(arr));
    sc.close();
  }
}
