import java.util.*;

class three {
  public List<List<Integer>> threeSum(int[] arr) {
    int target = 0;
    Set<List<Integer>> st = new HashSet<>();
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        for (int k = j + 1; k < n; k++) {
          if (arr[i] + arr[j] + arr[k] == target) {
            List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
            Collections.sort(temp);
            st.add(temp);
          }
        }
      }
    }
    return new ArrayList<>(st);
  }
}

class three_sum90 {
  public static void main(String[] args) {
    int[] arr = { -1, 0, 1, 2, -1, -4 };
    three obj = new three();
    List<List<Integer>> res = obj.threeSum(arr);

    for (List<Integer> triplet : res) {
      for (int num : triplet)
        System.out.print(num + " ");
      System.out.println();
    }
  }
}
