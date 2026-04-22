import java.util.Scanner;

class Solution {
  public void qckSort(int[] arr, int low, int high) {
    if (low < high) {
      int pivIndPartition = partition(arr, low, high);
      qckSort(arr, low, pivIndPartition - 1);
      qckSort(arr, pivIndPartition + 1, high);
    }
  }

  private int partition(int[] arr, int low, int high) {
    int pivot = arr[low];
    int i = low;
    int j = high;
    while (i < j) {
      while (arr[i] <= pivot && i <= high - 1) {
        i++;
      }

      while (arr[j] > pivot && j >= low + 1) {
        j--;
      }
      if (i < j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    int temp = arr[low];
    arr[low] = arr[j];
    arr[j] = temp;

    return j;
  }
}

class quick_sort59 {
  public static void main(String[] args) {
    Solution sol = new Solution();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("ENTER ELEMENT IN A GIVEN ARRAY");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sol.qckSort(arr, 0, n - 1);
    for (int num : arr) {
      System.out.print(num + " ");
    }
    sc.close();
  }
}
