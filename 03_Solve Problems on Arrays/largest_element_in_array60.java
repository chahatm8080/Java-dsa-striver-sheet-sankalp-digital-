import java.util.Scanner;

class largest_element_in_array60 {
  public static int largest(int[] arr, int n) {
    int maxi = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] > maxi) {
        maxi = arr[i];
      }
    }
    return maxi;
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
    System.out.println("Largest number is: ");
    System.out.println(largest(arr, n));
    sc.close();
  }
}
