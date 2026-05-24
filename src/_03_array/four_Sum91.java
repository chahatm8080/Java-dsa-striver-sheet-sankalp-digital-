import java.util.*;

class three {
  public List<List<Integer>> four_Sum(int[] arr) {
    int target = 0;
    Set<List<Integer>> st = new HashSet<>();
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        for (int k = j + 1; k < n; k++) {
          for (int l = k + 1; l < n; l++) {
            if (arr[i] + arr[j] + arr[k] + arr[l] == target) {
              List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
              Collections.sort(temp);
              st.add(temp);
            }
          }
        }
      }
    }
    return new ArrayList<>(st);
  }
}

class four_Sum91 {
  public static void main(String[] args) {
    int[] arr = { 1, 0, -1, 0, -2, 2 };
    three obj = new three();
    List<List<Integer>> res = obj.four_Sum(arr);

    for (List<Integer> triplet : res) {
      for (int num : triplet)
        System.out.print(num + " ");
      System.out.println();
    }
  }
}
