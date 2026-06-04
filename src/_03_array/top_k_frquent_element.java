import java.util.*;

class top {

  public int[] topkFrequent(int[] nums, int k) {

    Map<Integer, Integer> map = new HashMap<>();

    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    int[] result = new int[k];

    for (int i = 0; i < k; i++) {

      int maxFreq = 0;
      int element = 0;

      for (int key : map.keySet()) {

        if (map.get(key) > maxFreq) {
          maxFreq = map.get(key);
          element = key;
        }
      }

      result[i] = element;

      map.remove(element);
    }

    return result;
  }
}

public class top_k_frquent_element {
  public static void main(String[] args) {
    int[] arr = { 1 };
    top obj = new top();
    int k = 1;
    int[] res = obj.topkFrequent(arr, k);
    for (int num : res) {
      System.out.print(num + " ");
    }
  }

}
