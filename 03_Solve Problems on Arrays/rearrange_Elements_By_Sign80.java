import java.util.*;

class Solution {
  public int[] reElementBySign(int[] arr) {
    int n = arr.length;
    // List<Integer> positive = new ArrayList<>();
    // List<Integer> negative = new ArrayList<>();
    // for (int i = 0; i < n; i++) {
    // if (arr[i] > 0) {
    // positive.add(arr[i]);
    // } else {
    // negative.add(arr[i]);
    // }
    // }
    // for (int i = 0; i < n / 2; i++) {
    // arr[2 * i] = positive.get(i);
    // arr[2 * i + 1] = negative.get(i);
    // }
    // return arr;
    int[] ans = new int[n];
    int pos = 0, neg = 1;
    for (int i = 0; i < n; i++) {
      if (arr[i] < 0) {
        ans[neg] = arr[i];
        neg += 2;
      } else {
        ans[pos] = arr[i];
        pos += 2;
      }
    }
    return ans;
  }
}

class rearrange_Elements_By_Sign80 {
  public static void main(String[] args) {
    Solution sol = new Solution();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array:");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter elements in array");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("After consecutive arrangements of elements: ");
    int[] result = sol.reElementBySign(arr);
    for (int num : result) {
      System.out.print(num + " ");
    }
    sc.close();
  }

}