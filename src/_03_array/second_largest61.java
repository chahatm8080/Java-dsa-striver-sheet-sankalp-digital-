import java.util.Scanner;

class second_largest61 {
  public static int second_Large(int[] arr, int n) {
    if (n < 2)
      return -1;
    int large = Integer.MIN_VALUE;
    int s_large = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      if (arr[i] > large) {
        s_large = large;
        large = arr[i];
      } else if (arr[i] > s_large && large != arr[i]) {
        s_large = arr[i];
      }
    }
    return s_large;
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
    System.out.println("Second_Largest number is: ");
    System.out.println(second_Large(arr, n));
    sc.close();
  }
}
