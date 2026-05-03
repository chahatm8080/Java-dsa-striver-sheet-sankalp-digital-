import java.util.Scanner;

class Solution {
  public int majElement(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      int count = 0;
      for (int j = 0; j < n; j++) {
        if (arr[j] == arr[i]) {
          count++;
        }
      }
      if (count > n / 2) {
        return arr[i];
      }
    }
    return -1;
  }
}

class majority_element76 {
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
    System.out.println(sol.majElement(arr));
    sc.close();
  }
}
