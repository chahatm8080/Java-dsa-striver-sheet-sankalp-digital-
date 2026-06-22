import java.util.Scanner;

class missing {
  public int kthmissing(int[] arr, int k) {
    int n = arr.length;
    int low = 0;
    int high = n - 1;
    while (low <= high) {
      int mid = (low + high) / 2;
      int missing = arr[mid] - (mid + 1);
      if (missing < k) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return high + 1 + k;
  }
}

public class kthMissingNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = 3;
    int[] arr = new int[n];
    for (int i = 0; i < n; i++)
      arr[i] = sc.nextInt();

    missing obj = new missing();
    sc.close();
    System.out.println(obj.kthmissing(arr, k));
  }
}
