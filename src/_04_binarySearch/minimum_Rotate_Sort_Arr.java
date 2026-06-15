import java.util.*;

public class minimum_Rotate_Sort_Arr {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[] arr = new int[n];

    for (int i = 0; i < n; i++)
      arr[i] = sc.nextInt();

    int low = 0;
    int high = n - 1;

    int ans = Integer.MAX_VALUE;

    while (low <= high) {

      if (arr[low] <= arr[high]) {
        ans = Math.min(ans, arr[low]);
        break;
      }

      int mid = (low + high) / 2;

      if (arr[low] <= arr[mid]) {
        ans = Math.min(ans, arr[low]);
        low = mid + 1;
      } else {
        ans = Math.min(ans, arr[mid]);
        high = mid - 1;
      }
    }
    sc.close();
    System.out.print(ans);
  }
}