import java.util.Scanner;

class Solution {
  // public static void bubbleSort(int[] arr, int n) {
  // for (int i = n - 1; i >= 0; i--) {
  // int maxi = i;
  // for (int j = 0; j < i; j++) {
  // if (arr[j] > arr[maxi]) {
  // maxi = j;
  // }
  // }
  // int temp = arr[maxi];
  // arr[maxi] = arr[i];
  // arr[i] = temp;
  // }
  // for (int num : arr) {
  // System.out.print(num + " ");
  // }
  public void bubbleSort(int[] arr) {
    int n = arr.length;
    for (int i = n - 1; i >= 0; i--) {
      int maxi = i;
      for (int j = 0; j < i; j++) {
        if (arr[j] > arr[maxi]) {
          maxi = j;
        }
        int temp = arr[maxi];
        arr[maxi] = arr[i];
        arr[i] = temp;
      }
    }
    for (int num : arr) {
      System.out.print(num + " ");
    }
  }
}

class bubble_sort54 {
  public static void main(String[] args) {
    Solution sol = new Solution();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter array elements: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sol.bubbleSort(arr);
    sc.close();
  }
}