import java.util.*;

class firstSecond {
  public int firstPosition(int[] arr, int target) {
    int n = arr.length;
    int low = 0;
    int high = n - 1;
    int fPos = -1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (arr[mid] == target) {
        fPos = mid;
        high = mid - 1;
      } else if (arr[mid] < target) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return fPos;
  }

  public int secondPosition(int[] arr, int target) {
    int n = arr.length;
    int low = 0;
    int high = n - 1;
    int fPos = -1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (arr[mid] == target) {
        fPos = mid;
        low = mid + 1;
      } else if (arr[mid] < target) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return fPos;
  }
}

class firstLastPosElmnt {
  public static void main(String[] args) {
    firstSecond sol = new firstSecond();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int target = 8;
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int first = sol.firstPosition(arr, target);
    if (first == -1) {
      System.out.println("not found");
    }
    int second = sol.secondPosition(arr, target);
    System.out.print(first + " " + second);
    sc.close();
  }
}
