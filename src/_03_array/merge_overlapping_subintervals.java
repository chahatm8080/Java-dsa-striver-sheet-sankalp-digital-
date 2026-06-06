import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class mergeOverlap {
  public int[][] merge(int[][] intervals) {
    List<List<Integer>> merge = new ArrayList<>();
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
    for (int[] interval : intervals) {
      if (merge.isEmpty() || merge.get(merge.size() - 1).get(1) < interval[0]) {
        merge.add(Arrays.asList(interval[0], interval[1]));
      } else {
        int last = merge.size() - 1;
        int maxEnd = Math.max(merge.get(last).get(1), interval[1]);
        merge.get(last).set(1, maxEnd);
      }
    }
    int[][] ans = new int[merge.size()][2];
    for (int i = 0; i < merge.size(); i++) {
      ans[i][0] = merge.get(i).get(0);
      ans[i][1] = merge.get(i).get(1);
    }

    return ans;
  }
}

public class merge_overlapping_subintervals {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of intervals: ");
    int n = sc.nextInt();

    int[][] intervals = new int[n][2];

    System.out.println("Enter intervals (start end):");

    for (int i = 0; i < n; i++) {
      intervals[i][0] = sc.nextInt();
      intervals[i][1] = sc.nextInt();
    }

    mergeOverlap obj = new mergeOverlap();
    int[][] result = obj.merge(intervals);

    System.out.println("Merged Intervals:");

    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i][0] + " " + result[i][1]);
    }

    sc.close();
  }
}
