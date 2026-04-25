import java.util.Arrays;
import java.util.Scanner;

class rorate_Array_Rightkplace65 {
  public static void rotRight(int[] arr, int k) {
    int n = arr.length;
    if (n == 0)
      return;
    k = k % n;
    int[] temp = Arrays.copyOfRange(arr, n - k, n);
    for (int i = n - k - 1; i >= 0; i--) {
      arr[i + k] = arr[i];
    }
    for (int i = 0; i < k; i++) {
      arr[i] = temp[i];
    }
    for (int num : arr) {
      System.out.print(num + " ");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of arr: ");
    int n = sc.nextInt();
    int k = 3;
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    rotRight(arr, k);
    sc.close();
  }
}
