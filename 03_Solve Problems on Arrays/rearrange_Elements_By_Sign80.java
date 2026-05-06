import java.util.*;

class Solution {
  public int[] reElementBySign(int[] arr) {
    int n = arr.length;
    List<Integer> positive = new ArrayList<>();
    List<Integer> negative = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      if (arr[i] > 0) {
        positive.add(arr[i]);
      } else {
        negative.add(arr[i]);
      }
    }
    for (int i = 0; i < n / 2; i++) {
      arr[2 * i] = positive.get(i);
      arr[2 * i + 1] = negative.get(i);
    }
    return arr;
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
    int[] temp = sol.reElementBySign(arr);
    for (int num : temp) {
      System.out.print(num + " ");
    }
    sc.close();
  }

}