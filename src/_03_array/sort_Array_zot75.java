import java.util.Scanner;

class sort {
  public void sortColor(int[] arr) {
    // int n = arr.length;
    // int count0 = 0, count1 = 0, count2 = 0;
    // for (int i = 0; i < n; i++) {
    // if (arr[i] == 0) {
    // count0++;
    // } else if (arr[i] == 1) {
    // count1++;
    // } else {
    // count2++;
    // }
    // }
    // for (int i = 0; i < count0; i++) {
    // arr[i] = 0;
    // }
    // for (int i = count0; i < count0 + count1; i++) {
    // arr[i] = 1;
    // }
    // for (int i = count0 + count1; i < count0 + count1 + count2; i++) {
    // arr[i] = 2;
    // }
    // for (int num : arr) {
    // System.out.print(num + " ");
    // }
    int n = arr.length;
    int low = 0;
    int mid = 0;
    int high = n - 1;
    while (mid <= high) {
      if (arr[mid] == 0) {
        int temp = arr[mid];
        arr[mid] = arr[low];
        arr[low] = temp;
        low++;
        mid++;
      } else if (arr[mid] == 1) {
        mid++;
      } else {
        int temp = arr[mid];
        arr[mid] = arr[high];
        arr[high] = temp;
        high--;
      }
    }
    for (int num : arr) {
      System.out.print(num + " ");
    }
  }
}

class sort_Array_zot75 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sort sol = new sort();
    System.out.println("Enter size of array:");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter elements in array");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sol.sortColor(arr);
    sc.close();
  }
}