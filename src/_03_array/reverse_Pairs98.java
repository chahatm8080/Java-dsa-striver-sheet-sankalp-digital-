import java.util.*;

class pairs {
  public void merge(int[] arr, int low, int mid, int high) {
    List<Integer> temp = new ArrayList<>();
    int left = low;
    int right = mid + 1;
    while (left <= mid && right <= high) {
      if (arr[left] <= arr[right]) {
        temp.add(arr[left++]);
      } else
        temp.add(arr[right++]);
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

  public int mergePairs(int[] arr, int low, int mid, int high) {
    int right = mid + 1;
    int cnt = 0;
    for (int i = low; i <= mid; i++) {
      while (right <= high && arr[i] > 2L * arr[right])
        right++;
      cnt += right - (mid + 1);
    }
    return cnt;
  }

  public int mergeSort(int[] arr, int low, int high) {
    int cnt = 0;
    if (low >= high)
      return cnt;
    int mid = (low + high) / 2;
    cnt += mergeSort(arr, low, mid);
    cnt += mergeSort(arr, mid + 1, high);
    cnt += mergePairs(arr, low, mid, high);
    merge(arr, low, mid, high);
    return cnt;
  }
}

class reverse_Pairs98 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    pairs sol = new pairs();
    System.out.println("Enter size of the give array");
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("reverse pairs is: ");
    System.out.println(sol.mergeSort(arr, 0, n - 1));
    sc.close();
  }
}