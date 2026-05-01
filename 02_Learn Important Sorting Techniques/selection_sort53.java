import java.util.Scanner;

class selection_sort53 {
  public static void selSort(int[] arr, int n) {
    for (int i = 0; i < n - 1; i++) {
      int mini = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[mini]) {
          mini = j;
        }
        int temp = arr[mini];
        arr[mini] = arr[i];
        arr[i] = temp;
      }
      for (int num : arr) {
        System.out.print(num + " ");
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of arrays");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter elements in a given array");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    selSort(arr, n);
    sc.close();
  }
}