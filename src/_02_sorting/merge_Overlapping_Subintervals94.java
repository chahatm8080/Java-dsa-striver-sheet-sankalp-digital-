import java.util.*;

class subintervals {
  public List<List<Integer>> merge(int[][] intervals) {
    List<List<Integer>> ans = new ArrayList<>();
    int n = intervals.length;
    int i = 0;
    while (i < n) {
      int s = intervals[i][0];
      int e = intervals[i][1];
      int j = i + 1;
      while (j < n && intervals[j][0] <= e) {
        e = Math.max(e, intervals[j][1]);
        j++;
      }
      ans.add(Arrays.asList(s, e));
      i = j;
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
    List<List<Integer>> result = sol.merge(intervals);
    for (List<Integer> interval : result) {
      System.out.print(interval + " ");
    }
    sc.close();
  }
}
