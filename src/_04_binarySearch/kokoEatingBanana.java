import java.util.*;

class kaka {
  public int calculateTotalHours(int[] a, int hourly) {
    int totalHours = 0;
    for (int pile : a) {
      totalHours += (int) Math.ceil((double) pile / hourly);
    }
    return totalHours;
  }

  public int minEatingSpeed(int[] a, int h) {
    int maxVal = Arrays.stream(a).max().getAsInt();

    for (int i = 1; i <= maxVal; i++) {
      int hours = calculateTotalHours(a, i);

      if (hours <= h) {
        return i;
      }
    }
    return maxVal;
  }
}

class kokoEatingBanana {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[] arr = new int[n];
    for (int i = 0; i < n; i++)
      arr[i] = sc.nextInt();

    int h = 8;
    kaka obj = new kaka();
    sc.close();
    System.out.println(obj.minEatingSpeed(arr, h));
  }
}
