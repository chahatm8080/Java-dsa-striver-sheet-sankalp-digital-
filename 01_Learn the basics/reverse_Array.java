import java.util.Scanner;

public class reverse_Array {
  public void rev_Array(int arr[]) {
    int p1 = 0;
    int p2 = arr.length - 1;
    while (p1 < p2) {
      int temp = arr[p2];
      arr[p2] = arr[p1];
      arr[p1] = temp;
      p1++;
      p2--;
    }
  }

  public static void main(String[] args) {
    reverse_Array sol = new reverse_Array();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("enter number of elements ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sol.rev_Array(arr);

    for (int num : arr) {
      System.out.print(num + " ");
    }
    sc.close();
  }
}
