import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class mSort {
  public void merge(int[] arr, int low, int mid, int high) {
    List<Integer> temp = new ArrayList<>();
    int left = low;
    int right = mid + 1;
    while (left <= mid && right <= high) {
      if (arr[left] <= arr[right]) {
        temp.add(arr[left++]);
      } else {
        temp.add(arr[right++]);
      }
    }
    while (left <= mid) {
      temp.add(arr[left++]);
    }
    while (right <= high) {
      temp.add(arr[right++]);
    }
    for (int i = low; i <= high; i++) {
      arr[i] = temp.get(i - low);
    }
  }

  public void mergeSort(int[] arr, int low, int high) {
    if (low >= high)
      return;
    int mid = (low + high) / 2;
    mergeSort(arr, low, mid);
    mergeSort(arr, mid + 1, high);
    merge(arr, low, mid, high);
  }
}

class merge_sort56 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    mSort sol = new mSort();
    System.out.println("Enter size of array");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter elements");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sol.mergeSort(arr, 0, arr.length - 1);
    for (int num : arr) {
      System.out.print(num + " ");
    }
    sc.close();
  }
}