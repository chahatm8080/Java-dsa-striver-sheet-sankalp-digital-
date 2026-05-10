import java.util.Scanner;

class linear_Search67 {
  // Function to search for a number in the array
  public static int linearSearch(int[] arr, int n, int num) {
    int i;

    // Loop through the array to find the number
    for (i = 0; i < n; i++) {
      // If the current element matches the number, return its index
      if (arr[i] == num)
        return i;
    }

    // If the number is not found, return -1
    return -1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array:");
    int n = sc.nextInt();
    int num = 5;
    int arr[] = new int[n];
    System.out.println("Enter elements in array");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("linear search found an index: ");
    System.out.print(linearSearch(arr, n, num));
    sc.close();
  }
}
