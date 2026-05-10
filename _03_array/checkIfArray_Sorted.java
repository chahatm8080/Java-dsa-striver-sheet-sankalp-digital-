import java.util.Scanner;

class checkIfArray_Sorted {
  public static boolean checkSorted(int[] arr, int n) {
    int count = 0;
    for (int i = 0; i < n - 1; i++) {
      if (arr[i] > arr[i + 1])
        count++;
    }
    if (arr[n - 1] > arr[0])
      count++;
    if (count <= 1)
      return true;
    else
      return false;
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
    System.out.println(checkSorted(arr, n));
    sc.close();
  }
}
