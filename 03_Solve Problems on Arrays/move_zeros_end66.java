import java.util.Scanner;

class move_zeros_end66 {
  public static void move_zeros_end(int[] arr, int n) {
    // int[] temp = new int[arr.length];
    // int index = 0;
    // for (int i = 0; i < n; i++) {
    // if (arr[i] != 0) {
    // temp[index] = arr[i];
    // index++;
    // }
    // }
    // for (int i = 0; i < temp.length; i++) {
    // arr[i] = temp[i];
    // }
    // for (int num : arr) {
    // System.out.print(num + " ");
    // }
    int j = -1;
    for (int i = 0; i < n; i++) {
      if (arr[i] == 0) {
        j = i;
        break;
      }
    }
    if (j == -1)
      return;
    for (int i = j + 1; i < n; i++) {
      if (arr[i] != 0) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        j++;
      }
    }
    for (int num : arr) {
      System.out.print(num + " ");
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of arr: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    move_zeros_end(arr, n);
    sc.close();
  }
}
