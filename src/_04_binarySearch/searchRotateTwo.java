import java.util.Scanner;

public class searchRotateTwo {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of array: ");
    int n = sc.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter array elements:");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.print("Enter target: ");
    int target = sc.nextInt();

    int low = 0;
    int high = n - 1;

    while (low <= high) {

      int mid = low + (high - low) / 2;

      if (arr[mid] == target) {
        System.out.println("true");
        sc.close();
        return;
      }

      // Handle duplicates
      if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
        low++;
        high--;
        continue;
      }

      // Left half is sorted
      if (arr[low] <= arr[mid]) {

        if (arr[low] <= target && target < arr[mid]) {
          high = mid - 1;
        } else {
          low = mid + 1;
        }

      }
      // Right half is sorted
      else {

        if (arr[mid] < target && target <= arr[high]) {
          low = mid + 1;
        } else {
          high = mid - 1;
        }
      }
    }

    System.out.println("false");
    sc.close();
  }
}