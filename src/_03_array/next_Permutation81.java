import java.util.Scanner;

class permutation {
  public int[] next_Permutation(int[] arr) {
    int n = arr.length;
    int pivot = -1;
    for (int i = n - 2; i >= 0; i--) {
      if (arr[i] < arr[i + 1]) {
        pivot = i;
        break;
      }
    }
    for (int i = n - 1; pivot != -1 && i > pivot; i--) {
      if (arr[i] > arr[pivot]) {
        int temp = arr[i];
        arr[i] = arr[pivot];
        arr[pivot] = temp;
        break;
      }
    }
    int start = pivot + 1;
    int end = n - 1;
    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
    return arr;
  }
}

class next_Permutation81 {
  public static void main(String[] args) {
    permutation sol = new permutation();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of arr: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter array elements");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int[] result = sol.next_Permutation(arr);
    for (int num : result) {
      System.out.print(num + " ");
    }
    sc.close();
  }

}