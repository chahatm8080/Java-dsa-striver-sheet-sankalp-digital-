import java.util.Scanner;

class remove_Duplicate63 {
  public static int remDuplicate(int[] nums, int n) {
    // brute force approach t.c = O(n); s.c = o(n);
    // Set<Integer> st = new HashSet<>();

    // for (int i = 0; i < n; i++) {
    // st.add(arr[i]);
    // }

    // int i = 0;

    // for (int num : st) {
    // arr[i++] = num;
    // }

    // for (int j = 0; j < st.size(); j++) {
    // System.out.print(arr[j] + " ");
    // }
    int i = 0;
    for (int j = 1; j < n; j++) {
      if (nums[i] != nums[j]) {
        i++;
        nums[i] = nums[j];
      }
    }
    return i + 1;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array:");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter elements in array");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int k = remDuplicate(arr, n);
    for (int x = 0; x < k; x++) {
      System.out.print(arr[x] + " ");
    }
    sc.close();
  }
}
