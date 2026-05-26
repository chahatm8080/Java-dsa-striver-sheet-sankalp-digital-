import java.util.*;

class subintervals {
  public int[][] merge(int[][] intervals) {
    // List<List<Integer>> ans = new ArrayList<>();
    // int n = intervals.length;
    // int i = 0;
    // while (i < n) {
    // int s = intervals[i][0];
    // int e = intervals[i][1];
    // int j = i + 1;
    // while (j < n && intervals[j][0] <= e) {
    // e = Math.max(e, intervals[j][1]);
    // j++;
    // }
    // ans.add(Arrays.asList(s, e));
    // i = j;
    // }
    // return ans;
    // ------------------------optimal
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
    List<List<Integer>> merged = new ArrayList<>();
    for (int[] interval : intervals) {
      if (merged.isEmpty() || merged.get(merged.size() - 1).get(1) < interval[0]) {
        merged.add(Arrays.asList(interval[0], interval[1]));
      } else {
        int last = merged.size() - 1;
        int max_End = Math.max(merged.get(last).get(1), interval[1]);
        merged.get(last).set(1, max_End);
      }
    }
    int[][] ans = new int[merged.size()][2];
    for (int i = 0; i < merged.size(); i++) {
      ans[i][0] = merged.get(i).get(0);
      ans[i][1] = merged.get(i).get(1);
    }
    return ans;
  }
}

class merge_Overlapping_Subintervals94 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    subintervals sol = new subintervals();
    System.out.println(" enter the number of intervals: ");
    int n = sc.nextInt();
    int[][] intervals = new int[n][2];
    for (int i = 0; i < n; i++) {
      intervals[i][0] = sc.nextInt();
      intervals[i][1] = sc.nextInt();
    }
    int[][] result = sol.merge(intervals);
    for (int[] interval : result) {
      System.out.print(Arrays.toString(interval) + " ");
    }
    sc.close();
  }
}
