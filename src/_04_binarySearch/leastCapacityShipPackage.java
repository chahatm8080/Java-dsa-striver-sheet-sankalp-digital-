import java.util.*;

class shipPackage {
  public int days(int[] weight, int capacity) {
    int days = 1;
    int currentLoad = 0;
    for (int w : weight) {
      if (currentLoad + w > capacity) {
        days++;
        currentLoad = w;
      } else {
        currentLoad += w;
      }
    }
    return days;
  }

  public int shipWithinDays(int[] weight, int d) {
    int left = Arrays.stream(weight).max().getAsInt();
    int right = Arrays.stream(weight).sum();
    for (int capacity = left; capacity <= right; capacity++) {
      int needed = days(weight, capacity);
      if (needed <= d) {
        return capacity;
      }
    }
    return right;
  }
}

class leastCapacityShipPackage {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter packages: ");
    int n = sc.nextInt();
    System.out.println("Enter the weight of package");
    int[] weights = new int[n];
    for (int i = 0; i < n; i++) {
      weights[i] = sc.nextInt();
    }
    int d = 5;
    shipPackage sol = new shipPackage();
    System.out.println(sol.shipWithinDays(weights, d));
    sc.close();
  }
}