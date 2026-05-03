import java.util.Scanner;

class Solution {
  public int stockBuySell(int[] arr) {
    // --------------- Bruteforce method
    int maxi = 0;
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        int stock = arr[j] - arr[i];
        if (stock > maxi) {
          maxi = stock;
        }
      }
    }
    return maxi;
  }
}

class stocK_Buy_And_Sell79 {
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
    System.out.println("Best time to Buy and Sell Stock is: ");
    System.out.println(sol.stockBuySell(arr));
    sc.close();
  }
}
