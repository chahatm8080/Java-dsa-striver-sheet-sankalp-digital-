import java.util.HashMap;
import java.util.Scanner;

class subarray {
  public int subSumEqlk(int[] arr, int k) {
    // int n = arr.length;
    // int count = 0;
    // for (int i = 0; i < n; i++) {
    // int sum = 0;
    // for (int j = i; j < n; j++) {
    // sum += arr[j];
    // if (sum == k) {
    // count++;
    // }
    // }
    // }
    // return count;
    // ----------------------optimal approach
    int n = arr.length;
    HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
    int prefixSum = 0;
    int count = 0;
    prefixSumCount.put(0, 1);
    for (int i = 0; i < n; i++) {
      prefixSum += arr[i];
      int remove = prefixSum - k;
      if (prefixSumCount.containsKey(remove)) {
        count += prefixSumCount.get(remove);
      }
      prefixSumCount.put(prefixSum, prefixSumCount.getOrDefault(prefixSum, 0) + 1);
    }
    return count;
  }
}

class subarray_Sum_Equal_k87 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    subarray sol = new subarray();
    System.out.println("Enter size of array:");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter elements in array");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("enter the k sum which you wants to find: ");
    int k = sc.nextInt();

    System.out.println("total subarray sum equals to k is : ");
    System.out.print(sol.subSumEqlk(arr, k));
    sc.close();
  }
}
