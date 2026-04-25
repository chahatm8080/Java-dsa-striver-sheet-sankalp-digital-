import java.util.Scanner;

class rorate_Array_Rightkplace65 {
  public static void rotateRight(int[] arr, int left, int right) {
    if (arr.length <= 1)
      return;
    while (left < right) {
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
      left++;
      right--;
    }
  }

  public static void rotRight(int[] nums, int k) {
    int n = nums.length;
    if (n == 0 || k == 0)
      return;
    k = k % n;
    rotateRight(nums, 0, n - k - 1);
    rotateRight(nums, n - k, n - 1);
    rotateRight(nums, 0, n - 1);
    for (int num : nums) {
      System.out.print(num + " ");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of arr: ");
    int n = sc.nextInt();
    int k = 3;
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    rotRight(arr, k);
    sc.close();
  }
}
