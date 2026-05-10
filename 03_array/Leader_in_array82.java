import java.util.*;

class Solution {
  public ArrayList<Integer> Leaders(int[] arr) {
    // int n = arr.length;
    // ArrayList<Integer> ls = new ArrayList<>();
    // for (int i = 0; i < n; i++) {
    // boolean leader = true;
    // for (int j = i + 1; j < n; j++) {
    // if (arr[j] > arr[i]) {
    // leader = false;
    // break;
    // }
    // }
    // if (leader) {
    // ls.add(arr[i]);
    // }
    // }
    // return ls;
    int n = arr.length;
    ArrayList<Integer> ans = new ArrayList<>();
    if (n == 0)
      return ans;
    int max = arr[n - 1];
    ans.add(arr[n - 1]);
    for (int i = n - 2; i >= 0; i--) {
      if (arr[i] > max) {
        max = Math.max(max, arr[i]);
        ans.add(arr[i]);
      }
    }
    Collections.reverse(ans);
    return ans;
  }
}

class Leader_in_array82 {
  public static void main(String[] args) {
    Solution sol = new Solution();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array elements");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter element in array");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Longest element is: ");
    ArrayList<Integer> result = sol.Leaders(arr);
    for (int num : result) {
      System.out.print(num + " ");
    }
    sc.close();
  }
}
