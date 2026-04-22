import java.util.Scanner;

public class bubble_sort54 {
  public static void Bubble_sort(int[] arr, int n) {
    for (int i = n - 1; i > 0; i--) {
      int maxi = i;
      for (int j = 0; j <= i - 1; j++) {
        if (arr[j] > arr[maxi]) {
          maxi = j;
        }
      }
      int temp = arr[maxi];
      arr[i] = temp;
    }
    System.out.print("BUBBLE SORT DONE: ");
    for (int num : arr) {
      System.out.print(num + " ");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter elements in array");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    Bubble_sort(arr, n);
    sc.close();
  }
}
