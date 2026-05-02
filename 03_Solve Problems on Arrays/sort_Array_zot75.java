import java.util.Scanner;

class Solution {
  public void sortColor(int[] arr) {
    int n = arr.length;
    int count0 = 0, count1 = 0, count2 = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] == 0) {
        count0++;
      } else if (arr[i] == 1) {
        count1++;
      } else {
        count2++;
      }
    }
    for (int i = 0; i < count0; i++) {
      arr[i] = 0;
    }
    for (int i = count0; i < count0 + count1; i++) {
      arr[i] = 1;
    }
    for (int i = count0 + count1; i < count0 + count1 + count2; i++) {
      arr[i] = 2;
    }
    for (int num : arr) {
      System.out.print(num + " ");
    }
  }
}

class sort_Array_zot75 {
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
    sol.sortColor(arr);
    sc.close();
  }
}