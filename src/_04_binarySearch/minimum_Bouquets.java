// import java.util.*;

// public class minimum_Bouquets {

//   public static int minDays(int[] bloomDay, int m, int k) {
//     if ((long) m * k > bloomDay.length)
//       return -1;

//     int minDay = Integer.MAX_VALUE;
//     int maxDay = Integer.MIN_VALUE;

//     for (int day : bloomDay) {
//       minDay = Math.min(minDay, day);
//       maxDay = Math.max(maxDay, day);
//     }

//     for (int day = minDay; day <= maxDay; day++) {

//       int count = 0;
//       int bouquets = 0;

//       for (int bloom : bloomDay) {
//         if (bloom <= day) {
//           count++;
//           if (count == k) {
//             bouquets++;
//             count = 0;
//           }
//         } else {
//           count = 0;
//         }
//       }

//       if (bouquets >= m)
//         return day;
//     }

//     return -1;
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     int n = sc.nextInt();
//     int[] bloomDay = new int[n];

//     for (int i = 0; i < n; i++) {
//       bloomDay[i] = sc.nextInt();
//     }

//     int m = sc.nextInt();
//     int k = sc.nextInt();

//     System.out.println(minDays(bloomDay, m, k));

//     sc.close();
//   }
// }

import java.util.*;

class minimum_Bouquets {

  private static boolean canMake(int[] bloomDay, int day, int m, int k) {
    int count = 0;
    int bouquets = 0;

    for (int bloom : bloomDay) {
      if (bloom <= day) {
        count++;
      } else {
        bouquets += count / k;
        count = 0;
      }
    }

    bouquets += count / k;

    return bouquets >= m;
  }

  public static int minDays(int[] bloomDay, int m, int k) {
    if ((long) m * k > bloomDay.length)
      return -1;

    int low = Integer.MAX_VALUE;
    int high = Integer.MIN_VALUE;

    for (int day : bloomDay) {
      low = Math.min(low, day);
      high = Math.max(high, day);
    }

    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (canMake(bloomDay, mid, m, k))
        high = mid - 1;
      else
        low = mid + 1;
    }

    return low;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] bloomDay = new int[n];

    for (int i = 0; i < n; i++) {
      bloomDay[i] = sc.nextInt();
    }

    int m = sc.nextInt();
    int k = sc.nextInt();

    System.out.println(minDays(bloomDay, m, k));

    sc.close();
  }
}