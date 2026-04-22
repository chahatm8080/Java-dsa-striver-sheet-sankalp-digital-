import java.util.Scanner;

class insertion_sort55 {
  public static void insertion_sorts(int[] arr, int n) {
    for (int i = 1; i < n; i++) {
      int j = i;
      while (j > 0 && arr[j - 1] > arr[j]) {
        int temp = arr[j - 1];
        arr[j - 1] = arr[j];
        arr[j] = temp;
        j--;
      }
    }
    for (int num : arr) {
      System.out.print(num + " ");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the elements of array");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    insertion_sorts(arr, n);
    sc.close();
  }
}