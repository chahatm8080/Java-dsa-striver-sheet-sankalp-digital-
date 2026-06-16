// import java.util.Scanner;

// class findPeakElement {

//   public static void main(String[] args) {

//     Scanner sc = new Scanner(System.in);

//     int n = sc.nextInt();

//     int[] arr = new int[n];
//     for (int i = 0; i < n; i++)
//       arr[i] = sc.nextInt();

//     for (int i = 0; i < n; i++) {
//       if (((i == 0) || (arr[i - 1] < arr[i])) && ((i == n - 1) || (arr[i] > arr[i + 1]))) {
//         System.out.print(arr[i]);
//         return;
//       }
//     }
//   }
// }
import java.util.Scanner;

class findPeakElement {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[] arr = new int[n];
    for (int i = 0; i < n; i++)
      arr[i] = sc.nextInt();
    if (arr[0] > arr[1]) {
      System.out.println(arr[0]);
    }
    if (arr[n - 1] > arr[n - 2]) {
      System.out.println(arr[n - 1]);
    }
    int low = 1;
    int high = n - 2;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
        System.out.println(arr[mid]);
        return;
      } else if (arr[mid] > arr[mid - 1]) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
      // when arr[mid] is not greater than arr[mid-1] or arr[mid+1] then either we can
      // go to left or right
      // directly you can remove else if condition delete this (arr[mid+1]<arr[mid])
      // else {
      // low = mid + 1;
      // }
    }
    System.out.println("-1");
  }
}