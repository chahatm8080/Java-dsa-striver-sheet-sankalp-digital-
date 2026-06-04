import java.util.*;

class top {

  public int[] topkFrequent(int[] nums, int k) {
    // bruteforce approach
    // Map<Integer, Integer> map = new HashMap<>();

    // for (int num : nums) {
    // map.put(num, map.getOrDefault(num, 0) + 1);
    // }

    // int[] result = new int[k];

    // for (int i = 0; i < k; i++) {

    // int maxFreq = 0;
    // int element = 0;

    // for (int key : map.keySet()) {

    // if (map.get(key) > maxFreq) {
    // maxFreq = map.get(key);
    // element = key;
    // }
    // }

    // result[i] = element;

    // map.remove(element);
    // }

    // return result;
    // optimal approach
    @SuppressWarnings("unchecked")
    List<Integer>[] bucket = new List[nums.length + 1];
    Map<Integer, Integer> frequencyMap = new HashMap<>();
    for (int n : nums) {
      frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
    }
    for (int key : frequencyMap.keySet()) {
      int frequency = frequencyMap.get(key);
      if (bucket[frequency] == null) {
        bucket[frequency] = new ArrayList<>();
      }
      bucket[frequency].add(key);
    }
    int[] res = new int[k];
    int counter = 0;
    for (int pos = bucket.length - 1; pos >= 0 && counter < k; pos--) {
      if (bucket[pos] != null) {
        for (Integer integer : bucket[pos]) {
          res[counter++] = integer;
        }
      }
    }
    return res;
  }
}

public class top_k_frquent_element {
  public static void main(String[] args) {
    int[] arr = { 1, 1, 1, 3, 3, 3, 3, 4, 4 };
    top obj = new top();
    int k = 2;
    int[] res = obj.topkFrequent(arr, k);
    for (int num : res) {
      System.out.print(num + " ");
    }
  }

}
